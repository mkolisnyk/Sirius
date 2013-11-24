#!/usr/bin/env ruby
require 'ListBoxServiceDriver.rb'


Sirius::Client::Win32::Core::Listbox

endpoint_url = ARGV.shift
obj = ListBox.new(endpoint_url)

# run ruby with -d to see SOAP wiredumps.
obj.wiredump_dev = STDERR if $DEBUG

# SYNOPSIS
#   addSelectionByIndex(parameters)
#
# ARGS
#   parameters      AddSelectionByIndex - {http://controls.classes.win32.server.sirius.org/}addSelectionByIndex
#
# RETURNS
#   parameters      AddSelectionByIndexResponse - {http://controls.classes.win32.server.sirius.org/}addSelectionByIndexResponse
#
parameters = nil
puts obj.addSelectionByIndex(parameters)

# SYNOPSIS
#   addSelectionByName(parameters)
#
# ARGS
#   parameters      AddSelectionByName - {http://controls.classes.win32.server.sirius.org/}addSelectionByName
#
# RETURNS
#   parameters      AddSelectionByNameResponse - {http://controls.classes.win32.server.sirius.org/}addSelectionByNameResponse
#
parameters = nil
puts obj.addSelectionByName(parameters)

# SYNOPSIS
#   getItemsCount(parameters)
#
# ARGS
#   parameters      GetItemsCount - {http://controls.classes.win32.server.sirius.org/}getItemsCount
#
# RETURNS
#   parameters      GetItemsCountResponse - {http://controls.classes.win32.server.sirius.org/}getItemsCountResponse
#
parameters = nil
puts obj.getItemsCount(parameters)

# SYNOPSIS
#   getSelectedItems(parameters)
#
# ARGS
#   parameters      GetSelectedItems - {http://controls.classes.win32.server.sirius.org/}getSelectedItems
#
# RETURNS
#   parameters      GetSelectedItemsResponse - {http://controls.classes.win32.server.sirius.org/}getSelectedItemsResponse
#
parameters = nil
puts obj.getSelectedItems(parameters)

# SYNOPSIS
#   selectByIndex(parameters)
#
# ARGS
#   parameters      SelectByIndex - {http://controls.classes.win32.server.sirius.org/}selectByIndex
#
# RETURNS
#   parameters      SelectByIndexResponse - {http://controls.classes.win32.server.sirius.org/}selectByIndexResponse
#
parameters = nil
puts obj.selectByIndex(parameters)

# SYNOPSIS
#   getEndpoint(parameters)
#
# ARGS
#   parameters      GetEndpoint - {http://controls.classes.win32.server.sirius.org/}getEndpoint
#
# RETURNS
#   parameters      GetEndpointResponse - {http://controls.classes.win32.server.sirius.org/}getEndpointResponse
#
parameters = nil
puts obj.getEndpoint(parameters)

# SYNOPSIS
#   removeSelectionByIndex(parameters)
#
# ARGS
#   parameters      RemoveSelectionByIndex - {http://controls.classes.win32.server.sirius.org/}removeSelectionByIndex
#
# RETURNS
#   parameters      RemoveSelectionByIndexResponse - {http://controls.classes.win32.server.sirius.org/}removeSelectionByIndexResponse
#
parameters = nil
puts obj.removeSelectionByIndex(parameters)

# SYNOPSIS
#   removeSelectionByName(parameters)
#
# ARGS
#   parameters      RemoveSelectionByName - {http://controls.classes.win32.server.sirius.org/}removeSelectionByName
#
# RETURNS
#   parameters      RemoveSelectionByNameResponse - {http://controls.classes.win32.server.sirius.org/}removeSelectionByNameResponse
#
parameters = nil
puts obj.removeSelectionByName(parameters)

# SYNOPSIS
#   deselectAll(parameters)
#
# ARGS
#   parameters      DeselectAll - {http://controls.classes.win32.server.sirius.org/}deselectAll
#
# RETURNS
#   parameters      DeselectAllResponse - {http://controls.classes.win32.server.sirius.org/}deselectAllResponse
#
parameters = nil
puts obj.deselectAll(parameters)

# SYNOPSIS
#   getItemNames(parameters)
#
# ARGS
#   parameters      GetItemNames - {http://controls.classes.win32.server.sirius.org/}getItemNames
#
# RETURNS
#   parameters      GetItemNamesResponse - {http://controls.classes.win32.server.sirius.org/}getItemNamesResponse
#
parameters = nil
puts obj.getItemNames(parameters)

# SYNOPSIS
#   selectByName(parameters)
#
# ARGS
#   parameters      SelectByName - {http://controls.classes.win32.server.sirius.org/}selectByName
#
# RETURNS
#   parameters      SelectByNameResponse - {http://controls.classes.win32.server.sirius.org/}selectByNameResponse
#
parameters = nil
puts obj.selectByName(parameters)

# SYNOPSIS
#   equals(parameters)
#
# ARGS
#   parameters      Equals - {http://controls.classes.win32.server.sirius.org/}equals
#
# RETURNS
#   parameters      EqualsResponse - {http://controls.classes.win32.server.sirius.org/}equalsResponse
#
parameters = nil
puts obj.equals(parameters)

# SYNOPSIS
#   selectAll(parameters)
#
# ARGS
#   parameters      SelectAll - {http://controls.classes.win32.server.sirius.org/}selectAll
#
# RETURNS
#   parameters      SelectAllResponse - {http://controls.classes.win32.server.sirius.org/}selectAllResponse
#
parameters = nil
puts obj.selectAll(parameters)

# SYNOPSIS
#   getSelectedIndex(parameters)
#
# ARGS
#   parameters      GetSelectedIndex - {http://controls.classes.win32.server.sirius.org/}getSelectedIndex
#
# RETURNS
#   parameters      GetSelectedIndexResponse - {http://controls.classes.win32.server.sirius.org/}getSelectedIndexResponse
#
parameters = nil
puts obj.getSelectedIndex(parameters)

# SYNOPSIS
#   getSelectedItem(parameters)
#
# ARGS
#   parameters      GetSelectedItem - {http://controls.classes.win32.server.sirius.org/}getSelectedItem
#
# RETURNS
#   parameters      GetSelectedItemResponse - {http://controls.classes.win32.server.sirius.org/}getSelectedItemResponse
#
parameters = nil
puts obj.getSelectedItem(parameters)




Sirius::Client::Win32::Core::Listbox
