module Sirius
  module Client
    module Web
      module Classes
       
        class Frame
          attr_accessor :client
          attr_accessor :locator

          def initialize(client, locator)
            @client = client
            @locator = locator            
          end          
          
          def url
            @client.core.getURL
          end
          
          def location
            @client.core.getLocation(nil, locator)
          end
          
          def size
            @client.core.getSize(nil, locator);
          end
          
          def innerHtml
            @client.core.getAttribute(nil, @locator, "innerHTML")
          end
          
          def switchTo(frame)
            @client.core.selectFrameByName(frame.locator)
          end
        end
      end
    end
  end
end