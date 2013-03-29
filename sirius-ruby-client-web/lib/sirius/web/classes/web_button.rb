module Sirius
  module Client
    module Web
      module Classes
       
        class WebButton < WebControl
          attr_accessor :parent
          attr_accessor :parentElement
          attr_accessor :locator

          def initialize(parent, locator, parentElement=nil)
            @parent = parent
            @parentElement = parentElement
            @locator = locator            
          end          

          def text()
            res = self.value
            if(res == nil)
              res = self.innerText 
            end
            res
          end
        end
      end
    end
  end
end