module Sirius
  module Client
    module Win32
      module Classes
        class TopLevelWindow < MovableWindow
          def initialize(client=nil, locator=nil,parent=nil)
            super(client, parent, locator)
          end

          def set_active
            @client.core.window.activate(@locator.hwnd)
          end

          def menu
            if exists?
              return Menu.new(client,self)
            end
            return nil
          end

          def system_menu
            if (exists?)
              @hmenu = @client.core.window.getSystemMenu(@locator.hwnd, true);
              return Menu.new(client, self, @hmenu)
            end
            return nil
          end
        end
      end
    end
  end
end