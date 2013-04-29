require 'test/unit'

class TestInstall < Test::Unit::TestCase
  
  def package
    'sirius-client-core'
  end
      
  def install
    `gem install #{package} --local ./pkg/#{package}-#{File.read('VERSION').chomp}.gem --no-ri --no-rdoc`
  end
  
  def test_modules
    gems = [package]
    gems.each do |gem|
      `gem uninstall #{gem} -a -q -I`
      output = `gem search #{gem} -l`
      assert_equal nil,output.match("#{gem} [(]"),"The '#{gem}' module wasn't removed"
    end
    install

    output = `gem search #{package} -l`
    gems.each do |gem|
      assert_not_nil output.match(gem),"The '#{gem}' module wasn't found"
    end
  end

  def test_inclusions
    install
    assert_nothing_raised do
      require 'sirius'
    end
  end

  def test_new_instances
    install
    assert_nothing_raised do
      require 'sirius'
      @client = Sirius::Client::InternalClient.new
    end
    
  end
end