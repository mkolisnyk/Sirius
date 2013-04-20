module Sirius
  module Client
    module Win32
      module Classes
        class Control < Window
          def initialize(locator, parent = nil)
            @locator = locator
            @parent = parent

            @client = @parent.client if parent != nil
          end
        end
      end
    end
  end
end