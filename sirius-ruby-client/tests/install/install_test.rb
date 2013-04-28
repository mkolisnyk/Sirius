require 'test/unit'

class TestInstall < Test::Unit::TestCase
  
  def install
    `gem install sirius-client --local ./pkg/sirius-client-#{File.read('VERSION').chomp}.gem --no-ri --no-rdoc`
  end
  
  def test_modules
    gems = ['sirius-client']#,'sirius-client-core','sirius-client-win32']
    gems.each do |gem|
      `gem uninstall #{gem} -a -q`
      output = `gem search #{gem} -l`
      assert_equal nil,output.match("#{gem} [(]"),"The '#{gem}' module wasn't removed"
    end
    install

    output = `gem search sirius-client -l`
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