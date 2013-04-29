require 'sirius/win32/core.rb'

module Sirius
  module Client
    module Win32
      class Win32
        attr_accessor :core
        attr_accessor :utils
        def initialize(host = 'localhost', port = '21212')
          @core = Core::Core.new(host, port)
          @utils = Core::Utils::Win32Utils.new(
            "http://#{host}:#{port}/win32/utils")
        end
      end
    end
  end
end