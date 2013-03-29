module Sirius
  module Client
    module Web
      module Classes
       
        class Page < Frame
          attr_accessor :client
          attr_accessor :locator

          def initialize(client, locator = nil)
            @client = client
            @locator = locator            
          end          
          
          def title()
            @client.core.getTitle()
          end
          
          def back()
            @client.core.back()
          end
          
          def forward()
            @client.core.forward()
          end
          
          def refresh()
            @client.core.refresh()
          end
          
          def open(url)
            @client.core.open(url)
          end
          
          def switchTo(page)
            @client.core.selectWindow(page.locator)
          end
        end
      end
    end
  end
end