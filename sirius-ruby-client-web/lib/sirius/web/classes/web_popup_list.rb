module Sirius
  module Client
    module Web
      module Classes
        class WebPopupList < WebControl
          def initialize(parent, locator, parentElement=nil)
            super(parent,locator,parentElement)
          end

          def multi?()
            client().core.isMultiple(@parentElement, @locator)
          end
      
          def deselectAll()
            client().core.deselectAll(@parentElement, @locator)
          end
          
          def deselectByIndex(index)
            client().core.deselectByIndex(@parentElement, @locator, index)
          end
          
          def  deselectByValue(value)
            client().core.deselectByValue(@parentElement, @locator, value)
          end
          
          def deselectByVisibleText(text)
            client().core.deselectByVisibleText(@parentElement, @locator, text)
          end
          
          def getAllOptions()
            client().core.getAllOptions(@parentElement, @locator)
          end
          
          def selectByIndex(index)
            client().core.selectByIndex(@parentElement, @locator, index)
          end
          
          def selectByValue(value)
            client().core.selectByValue(@parentElement, @locator, value)
          end
          
          def selectByVisibleText(text)
            client().core.selectByVisibleText(@parentElement, @locator, text)
          end
          
          def getAllSelectedOptions()
            client().core.getAllSelectedOptions(@parentElement, @locator)
          end
          
          def getFirstSelectedOption()
            client().core.getFirstSelectedOption(@parentElement, @locator)
          end
          
        end
      end
    end
  end
end