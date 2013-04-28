module Sirius
  module Client
    module Web
      module Classes
        class WebCheckBox < WebRadioButton
          def initialize(parent, locator, parentElement = nil)
            super(parent, locator, parentElement)
          end

          def uncheck
            click if checked?
          end
        end
      end
    end
  end
end