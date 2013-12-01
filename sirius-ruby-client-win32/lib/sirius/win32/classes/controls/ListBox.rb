module Sirius
  module Client
    module Win32
      module Classes
        module Controls
          class ListBox < Control
            def initialize(locator, parent = nil)
              super(locator, parent)
            end

            # SYNOPSIS
            #   addSelectionByIndex(parameters)
            #
            # ARGS
            #   parameters      AddSelectionByIndex - {http://controls.classes.win32.server.sirius.org/}addSelectionByIndex
            #
            # RETURNS
            #   parameters      AddSelectionByIndexResponse - {http://controls.classes.win32.server.sirius.org/}addSelectionByIndexResponse
            #
            def add_selection_by_index
              @client.core.listbox.addSelectionByIndex(parameters)
            end

            # SYNOPSIS
            #   addSelectionByName(parameters)
            #
            # ARGS
            #   parameters      AddSelectionByName - {http://controls.classes.win32.server.sirius.org/}addSelectionByName
            #
            # RETURNS
            #   parameters      AddSelectionByNameResponse - {http://controls.classes.win32.server.sirius.org/}addSelectionByNameResponse
            #
            def add_selection_by_name
              @client.core.listbox.addSelectionByName(parameters)
            end

            # SYNOPSIS
            #   getItemsCount(parameters)
            #
            # ARGS
            #   parameters      GetItemsCount - {http://controls.classes.win32.server.sirius.org/}getItemsCount
            #
            # RETURNS
            #   parameters      GetItemsCountResponse - {http://controls.classes.win32.server.sirius.org/}getItemsCountResponse
            #
            def get_items_count
              @client.core.listbox.getItemsCount(parameters)
            end

            # SYNOPSIS
            #   getSelectedItems(parameters)
            #
            # ARGS
            #   parameters      GetSelectedItems - {http://controls.classes.win32.server.sirius.org/}getSelectedItems
            #
            # RETURNS
            #   parameters      GetSelectedItemsResponse - {http://controls.classes.win32.server.sirius.org/}getSelectedItemsResponse
            #
            def get_selected_items
              @client.core.listbox.getSelectedItems(parameters)
            end

            # SYNOPSIS
            #   selectByIndex(parameters)
            #
            # ARGS
            #   parameters      SelectByIndex - {http://controls.classes.win32.server.sirius.org/}selectByIndex
            #
            # RETURNS
            #   parameters      SelectByIndexResponse - {http://controls.classes.win32.server.sirius.org/}selectByIndexResponse
            #
            def select_by_index
              @client.core.listbox.selectByIndex(parameters)
            end

            # SYNOPSIS
            #   getEndpoint(parameters)
            #
            # ARGS
            #   parameters      GetEndpoint - {http://controls.classes.win32.server.sirius.org/}getEndpoint
            #
            # RETURNS
            #   parameters      GetEndpointResponse - {http://controls.classes.win32.server.sirius.org/}getEndpointResponse
            #
            def get_endpoint
              @client.core.listbox.getEndpoint(parameters)
            end

            # SYNOPSIS
            #   removeSelectionByIndex(parameters)
            #
            # ARGS
            #   parameters      RemoveSelectionByIndex - {http://controls.classes.win32.server.sirius.org/}removeSelectionByIndex
            #
            # RETURNS
            #   parameters      RemoveSelectionByIndexResponse - {http://controls.classes.win32.server.sirius.org/}removeSelectionByIndexResponse
            #
            def remove_selection_by_index
              @client.core.listbox.removeSelectionByIndex(parameters)
            end

            # SYNOPSIS
            #   removeSelectionByName(parameters)
            #
            # ARGS
            #   parameters      RemoveSelectionByName - {http://controls.classes.win32.server.sirius.org/}removeSelectionByName
            #
            # RETURNS
            #   parameters      RemoveSelectionByNameResponse - {http://controls.classes.win32.server.sirius.org/}removeSelectionByNameResponse
            #
            def remove_selection_by_name
              @client.core.listbox.removeSelectionByName(parameters)
            end

            # SYNOPSIS
            #   deselectAll(parameters)
            #
            # ARGS
            #   parameters      DeselectAll - {http://controls.classes.win32.server.sirius.org/}deselectAll
            #
            # RETURNS
            #   parameters      DeselectAllResponse - {http://controls.classes.win32.server.sirius.org/}deselectAllResponse
            #
            def deselect_all
              @client.core.listbox.deselectAll(parameters)
            end

            # SYNOPSIS
            #   getItemNames(parameters)
            #
            # ARGS
            #   parameters      GetItemNames - {http://controls.classes.win32.server.sirius.org/}getItemNames
            #
            # RETURNS
            #   parameters      GetItemNamesResponse - {http://controls.classes.win32.server.sirius.org/}getItemNamesResponse
            #
            def get_item_names
              @client.core.listbox.getItemNames(parameters)
            end

            # SYNOPSIS
            #   selectByName(parameters)
            #
            # ARGS
            #   parameters      SelectByName - {http://controls.classes.win32.server.sirius.org/}selectByName
            #
            # RETURNS
            #   parameters      SelectByNameResponse - {http://controls.classes.win32.server.sirius.org/}selectByNameResponse
            #
            def select_by_name
              @client.core.listbox.selectByName(parameters)
            end

            # SYNOPSIS
            #   selectAll(parameters)
            #
            # ARGS
            #   parameters      SelectAll - {http://controls.classes.win32.server.sirius.org/}selectAll
            #
            # RETURNS
            #   parameters      SelectAllResponse - {http://controls.classes.win32.server.sirius.org/}selectAllResponse
            #
            def select_all
              @client.core.listbox.selectAll(parameters)
            end

            # SYNOPSIS
            #   getSelectedIndex(parameters)
            #
            # ARGS
            #   parameters      GetSelectedIndex - {http://controls.classes.win32.server.sirius.org/}getSelectedIndex
            #
            # RETURNS
            #   parameters      GetSelectedIndexResponse - {http://controls.classes.win32.server.sirius.org/}getSelectedIndexResponse
            #
            def get_selected_index
              @client.core.listbox.getSelectedIndex(parameters)
            end

            # SYNOPSIS
            #   getSelectedItem(parameters)
            #
            # ARGS
            #   parameters      GetSelectedItem - {http://controls.classes.win32.server.sirius.org/}getSelectedItem
            #
            # RETURNS
            #   parameters      GetSelectedItemResponse - {http://controls.classes.win32.server.sirius.org/}getSelectedItemResponse
            #
            def get_selected_item
              @client.core.listbox.getSelectedItem(parameters)
            end
          end
        end
      end
    end
  end
end