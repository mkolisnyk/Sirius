module Sirius
  module Client
    module Web
      module Classes
       
        class WebEdit < WebControl
          attr_accessor :parent
          attr_accessor :parentElement
          attr_accessor :locator

          def initialize(parent, locator, parentElement=nil)
            @parent = parent
            @parentElement = parentElement
            @locator = locator            
          end          

          def type(content)
            client().core.sendKeys(@parentElement, @locator, content)
          end
          
          def text()
            self.value
          end
        end
      end
    end
  end
end