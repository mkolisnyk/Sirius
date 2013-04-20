require 'core/system.rb'

module Sirius
  module Client
    module Core
      class Core
        attr_accessor(:system)
        def initialize(host = 'localhost', port = '21212')
          @system = System::System.new(host, port)
        end
      end
    end
  end
end