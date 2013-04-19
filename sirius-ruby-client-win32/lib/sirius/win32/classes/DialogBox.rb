module Sirius
  module Client
    module Win32
      module Classes
        class DialogBox < TopLevelWindow
          def initialize(locator,client=nil,parent=nil)
            super(client, parent, locator);
          end

          def exists?()
            if (@parent == nil)
              return super.exists?
            end

            return false unless @parent.exists?

            hwnd = @client.utils.searchSameThreadWindow(
            @parent.hwnd,
            @locator)

            if (hwnd == 0)
              return false
            else
              @locator.hwnd = hwnd
            end
            return true
          end

          #          
          def exists?(timeout)
            return waitFor(timeout, "exists", true)
          end
        end
      end
    end
  end
end