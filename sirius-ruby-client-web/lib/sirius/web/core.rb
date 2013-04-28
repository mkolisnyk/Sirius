module Sirius
  module Client
    module Web
      module Core
        class Core
          attr_accessor :core_client
          attr_accessor :select_client

          def initialize(host = 'localhost', port = '21212')
            @core_client = WebCore.new("http://#{host}:#{port}")
            @select_client = Select::WebSelect.new("http://#{host}:#{port}")
          end

          def method_missing?(name, *args)
            if @core_client.method_defined? name
              return @core_client.method(name).call(args)
            end
            if @select_client.method_defined? name
              return @select_client.method(name).call(args)
            end

            raise "No method #{name} defined for Core class"
          end
        end
      end
    end
  end
end
