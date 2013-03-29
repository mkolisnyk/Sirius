module Sirius
  module Client
    module Web
      module Classes
        class WebRadioButton < WebButton

          def initialize(parent, locator, parentElement=nil)
            super(parent,locator,parentElement)
          end
          
          def checked?()
            client().core.isSelected(@parentElement, @locator)
          end
          
          def check()
            click unless checked?
          end
        end
      end
    end
  end
end