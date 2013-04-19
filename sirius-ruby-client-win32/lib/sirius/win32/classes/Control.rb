module Sirius
  module Client
    module Win32
      module Classes
        class Control < Window
          def initialize(locator,parent=nil)
            @locator = locator
            @parent=parent

            if(parent != nil)
              @client = @parent.client
            end
          end
        end
      end
    end
  end
end