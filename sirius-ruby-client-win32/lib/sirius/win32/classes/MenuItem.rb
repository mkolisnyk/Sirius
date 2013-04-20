module Sirius
  module Client
    module Win32
      module Classes
        class MenuItem

          attr_accessor client
          attr_accessor owner
          attr_accessor hmenu;
          attr_accessor pos;

          def initialize(client, owner, hmenu, pos)
            @client = client
            @owner = owner
            @hmenu = hmenu
            @pos = pos
          end

          def checked?
            false
          end

          def enabled?
            false
          end

          def separator?
            false
          end

          def pick
            @client.core.menu.pickItem(@owner.hwnd, @hmenu, @pos)
          end
        end
      end
    end
  end
end