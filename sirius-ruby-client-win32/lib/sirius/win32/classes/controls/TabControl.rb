module Sirius
  module Client
    module Win32
      module Classes
        module Controls
          class TabControl < Control
            def initialize(locator, parent = nil)
              super(locator, parent)
            end

            # SYNOPSIS
            #   getSelectedItem(parameters)
            #
            # ARGS
            #   parameters      GetSelectedItem - {http://controls.classes.win32.server.sirius.org/}GetSelectedItem
            #
            # RETURNS
            #   parameters      GetSelectedItemResponse - {http://controls.classes.win32.server.sirius.org/}GetSelectedItemResponse
            #
            def get_selected_item
              @client.core.tabcontrol.getSelectedItem(parameters)
            end

            # SYNOPSIS
            #   selectByIndex(parameters)
            #
            # ARGS
            #   parameters      SelectByIndex - {http://controls.classes.win32.server.sirius.org/}SelectByIndex
            #
            # RETURNS
            #   parameters      SelectByIndexResponse - {http://controls.classes.win32.server.sirius.org/}SelectByIndexResponse
            #
            def select_by_index
              @client.core.tabcontrol.selectByIndex(parameters)
            end

            # SYNOPSIS
            #   getItemNames(parameters)
            #
            # ARGS
            #   parameters      GetItemNames - {http://controls.classes.win32.server.sirius.org/}GetItemNames
            #
            # RETURNS
            #   parameters      GetItemNamesResponse - {http://controls.classes.win32.server.sirius.org/}GetItemNamesResponse
            #
            def get_item_names
              @client.core.tabcontrol.getItemNames(parameters)
            end

            # SYNOPSIS
            #   getCurSel(parameters)
            #
            # ARGS
            #   parameters      GetCurSel - {http://controls.classes.win32.server.sirius.org/}GetCurSel
            #
            # RETURNS
            #   parameters      GetCurSelResponse - {http://controls.classes.win32.server.sirius.org/}GetCurSelResponse
            #
            def get_cur_sel
              @client.core.tabcontrol.getCurSel(parameters)
            end

            # SYNOPSIS
            #   setCurFocus(parameters)
            #
            # ARGS
            #   parameters      SetCurFocus - {http://controls.classes.win32.server.sirius.org/}SetCurFocus
            #
            # RETURNS
            #   parameters      SetCurFocusResponse - {http://controls.classes.win32.server.sirius.org/}SetCurFocusResponse
            #
            def set_cur_focus
              @client.core.tabcontrol.setCurFocus(parameters)
            end

            # SYNOPSIS
            #   getItemRect(parameters)
            #
            # ARGS
            #   parameters      GetItemRect - {http://controls.classes.win32.server.sirius.org/}GetItemRect
            #
            # RETURNS
            #   parameters      GetItemRectResponse - {http://controls.classes.win32.server.sirius.org/}GetItemRectResponse
            #
            def get_item_rect
              @client.core.tabcontrol.getItemRect(parameters)
            end

            # SYNOPSIS
            #   setCurSel(parameters)
            #
            # ARGS
            #   parameters      SetCurSel - {http://controls.classes.win32.server.sirius.org/}SetCurSel
            #
            # RETURNS
            #   parameters      SetCurSelResponse - {http://controls.classes.win32.server.sirius.org/}SetCurSelResponse
            #
            def set_cur_sel
              @client.core.tabcontrol.setCurSel(parameters)
            end

            # SYNOPSIS
            #   getCurFocus(parameters)
            #
            # ARGS
            #   parameters      GetCurFocus - {http://controls.classes.win32.server.sirius.org/}GetCurFocus
            #
            # RETURNS
            #   parameters      GetCurFocusResponse - {http://controls.classes.win32.server.sirius.org/}GetCurFocusResponse
            #
            def get_cur_focus
              @client.core.tabcontrol.getCurFocus(parameters)
            end

            # SYNOPSIS
            #   select(parameters)
            #
            # ARGS
            #   parameters      Select - {http://controls.classes.win32.server.sirius.org/}Select
            #
            # RETURNS
            #   parameters      SelectResponse - {http://controls.classes.win32.server.sirius.org/}SelectResponse
            #
            def select
              @client.core.tabcontrol.select(parameters)
            end

            # SYNOPSIS
            #   hitTest(parameters)
            #
            # ARGS
            #   parameters      HitTest - {http://controls.classes.win32.server.sirius.org/}HitTest
            #
            # RETURNS
            #   parameters      HitTestResponse - {http://controls.classes.win32.server.sirius.org/}HitTestResponse
            #
            def hit_test
              @client.core.tabcontrol.hitTest(parameters)
            end

            # SYNOPSIS
            #   getItemCount(parameters)
            #
            # ARGS
            #   parameters      GetItemCount - {http://controls.classes.win32.server.sirius.org/}GetItemCount
            #
            # RETURNS
            #   parameters      GetItemCountResponse - {http://controls.classes.win32.server.sirius.org/}GetItemCountResponse
            #
            def get_item_count
              @client.core.tabcontrol.getItemCount(parameters)
            end

            # SYNOPSIS
            #   getRowCount(parameters)
            #
            # ARGS
            #   parameters      GetRowCount - {http://controls.classes.win32.server.sirius.org/}GetRowCount
            #
            # RETURNS
            #   parameters      GetRowCountResponse - {http://controls.classes.win32.server.sirius.org/}GetRowCountResponse
            #
            def get_row_count
              @client.core.tabcontrol.getRowCount(parameters)
            end

            # SYNOPSIS
            #   getItem(parameters)
            #
            # ARGS
            #   parameters      GetItem - {http://controls.classes.win32.server.sirius.org/}GetItem
            #
            # RETURNS
            #   parameters      GetItemResponse - {http://controls.classes.win32.server.sirius.org/}GetItemResponse
            #
            def get_item
              @client.core.tabcontrol.getItem(parameters)
            end
          end
        end
      end
    end
  end
end