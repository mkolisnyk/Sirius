module Sirius
  module Client
    module Win32
      module Classes
        module Controls
          class CheckBox < Button
            def initialize(locator, parent = nil)
              super(locator, parent)
            end
          end
        end
      end
    end
  end
end