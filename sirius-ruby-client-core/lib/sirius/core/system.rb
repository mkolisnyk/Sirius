require 'system/dir.rb'
require 'system/file.rb'
require 'system/sys.rb'

module Sirius
  module Client
    module Core
      module System
        class System
          attr_accessor(:dir, :file, :sys)
          def initialize(host = 'localhost', port = '21212')
            @dir = DirectoryOperations.new(host, port)
            @file = FileOperations.new(host, port)
            @sys = SystemOperations.new(host, port)
          end
        end
      end
    end
  end
end