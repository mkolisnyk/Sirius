# encoding: UTF-8
require 'sirius/web/core.rb'

module Sirius
  module Client
    module Web
      class Web
        attr_accessor :core
        attr_accessor :token
        def initialize(host = 'localhost', port = '21212')
          @core = Core::Core.new(host, port)
          @token = nil
        end

        def start
          @token = @core.start
        end

        def stop
          @core.stop @token
        end

        def method_missing?(name, *args)
          @core.method(name).call(@token, args)
        end
      end
    end
  end
end