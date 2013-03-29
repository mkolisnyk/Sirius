module Sirius
  module Client
    module Web
      module Classes
       
        class Form < Frame
          attr_accessor :client
          attr_accessor :locator

          def initialize(client, locator)
            @client = client
            @locator = locator            
          end          

          def submit
            @client.core.submit(nil, locator);
          end

          def method_missing?(name,*args)
            @client.core.getAttribute(nil, @locator, name)
          end
        end
      end
    end
  end
end