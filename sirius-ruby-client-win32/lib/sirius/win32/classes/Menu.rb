module Sirius
  module Client
    module Win32
      module Classes
        class Menu

          MF_BYCOMMAND = 0x00000000
          MF_BYPOSITION = 0x00000400

          attr_accessor client
          attr_accessor owner
          attr_accessor hmenu
          def initialize(client, owner=nil, hmenu=nil)
            @client = client
            @owner = owner
            if hmenu == nil
              @hmenu = hmenu;
            else
              @hmenu = @client.core.window.getMenu( @owner.hwnd )
            end
          end

          def from_menu(parent, text)
            @client = parent.client
            @owner = parent.owner
            @hmenu = parent.menu(text).hmenu;
          end

          def get_menu_item_text(position)
            maxLength = 255;

            buffer = " " * maxLength
            @client.core.menu.getMenuString(@hmenu, position, buffer, maxLength,MF_BYPOSITION)
            buffer
          end

          def get_sub_menu(position)
            sub_menu = client.core.menu.getSubMenu(@hmenu, position)
            Menu.new(@client, @owner, sub_menu)
          end

          def pick(position)
            @client.core.menu.pickItem(owner.hwnd, @hmenu, position)
          end

          def get_item_names
            #      count = @client.core.menu.getMenuItemCount(@hmenu)
            #      String[] names = new String[count];
            #
            #      for (int i = 0; i < count; i++) {
            #        UnsignedShort[] buf = new UnsignedShort[255];
            #        client.core().menu()
            #            .getMenuString(hmenu, i, buf, 255, (int) MF_BYPOSITION);
            #        byte[] text = new byte[buf.length];
            #
            #        for (int j = 0; j < buf.length; j++) {
            #          text[j] = buf[j].byteValue();
            #        }
            #        names[i] = new String(text);
            #      }
            #
            #      return names;
          end

          def menu(title)
            names = get_item_names
            item = names.index { |name| ( name.match(title) || name.index(title)!=nil ) }
            sub_hmenu = @client.core.menu.getSubMenu(hmenu, item)
            Menu.new(@client, @owner, sub_hmenu)
          end

          def item(title)
            names = get_item_names
            item = names.index{|name| (name.match(title) || name.index(title)!=nil ) }
            MenuItem.new(@client, @owner, @hmenu, item)
          end
        end
      end
    end
  end
end