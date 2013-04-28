module Sirius
  module Client
    module Web
      module Classes
        class WebRadioButton < WebButton
          def initialize(parent, locator, parent_element = nil)
            super(parent, locator, parent_element)
          end

          def checked?
            client.core.isSelected(@parent_element, @locator)
          end

          def check
            click unless checked?
          end
        end
      end
    end
  end
end