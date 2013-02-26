#!/usr/bin/env ruby
require 'MenuServiceDriver.rb'

Sirius::Client::Win32::Core::Menu

endpoint_url = ARGV.shift
obj = Menu.new(endpoint_url)

# run ruby with -d to see SOAP wiredumps.
obj.wiredump_dev = STDERR if $DEBUG

# SYNOPSIS
#   isMenu(parameters)
#
# ARGS
#   parameters      IsMenu - {http://classes.win32.server.sirius.org/}IsMenu
#
# RETURNS
#   parameters      IsMenuResponse - {http://classes.win32.server.sirius.org/}IsMenuResponse
#
parameters = nil
puts obj.isMenu(parameters)

# SYNOPSIS
#   getMenuInfo(parameters)
#
# ARGS
#   parameters      GetMenuInfo - {http://classes.win32.server.sirius.org/}GetMenuInfo
#
# RETURNS
#   parameters      GetMenuInfoResponse - {http://classes.win32.server.sirius.org/}GetMenuInfoResponse
#
parameters = nil
puts obj.getMenuInfo(parameters)

# SYNOPSIS
#   getMenuState(parameters)
#
# ARGS
#   parameters      GetMenuState - {http://classes.win32.server.sirius.org/}GetMenuState
#
# RETURNS
#   parameters      GetMenuStateResponse - {http://classes.win32.server.sirius.org/}GetMenuStateResponse
#
parameters = nil
puts obj.getMenuState(parameters)

# SYNOPSIS
#   getSubMenu(parameters)
#
# ARGS
#   parameters      GetSubMenu - {http://classes.win32.server.sirius.org/}GetSubMenu
#
# RETURNS
#   parameters      GetSubMenuResponse - {http://classes.win32.server.sirius.org/}GetSubMenuResponse
#
parameters = nil
puts obj.getSubMenu(parameters)

# SYNOPSIS
#   getMenuItemRect(parameters)
#
# ARGS
#   parameters      GetMenuItemRect - {http://classes.win32.server.sirius.org/}GetMenuItemRect
#
# RETURNS
#   parameters      GetMenuItemRectResponse - {http://classes.win32.server.sirius.org/}GetMenuItemRectResponse
#
parameters = nil
puts obj.getMenuItemRect(parameters)

# SYNOPSIS
#   getMenuDefaultItem(parameters)
#
# ARGS
#   parameters      GetMenuDefaultItem - {http://classes.win32.server.sirius.org/}GetMenuDefaultItem
#
# RETURNS
#   parameters      GetMenuDefaultItemResponse - {http://classes.win32.server.sirius.org/}GetMenuDefaultItemResponse
#
parameters = nil
puts obj.getMenuDefaultItem(parameters)

# SYNOPSIS
#   getMenuItemCount(parameters)
#
# ARGS
#   parameters      GetMenuItemCount - {http://classes.win32.server.sirius.org/}GetMenuItemCount
#
# RETURNS
#   parameters      GetMenuItemCountResponse - {http://classes.win32.server.sirius.org/}GetMenuItemCountResponse
#
parameters = nil
puts obj.getMenuItemCount(parameters)

# SYNOPSIS
#   getMenuItemID(parameters)
#
# ARGS
#   parameters      GetMenuItemID - {http://classes.win32.server.sirius.org/}GetMenuItemID
#
# RETURNS
#   parameters      GetMenuItemIDResponse - {http://classes.win32.server.sirius.org/}GetMenuItemIDResponse
#
parameters = nil
puts obj.getMenuItemID(parameters)

# SYNOPSIS
#   getMenuItemInfo(parameters)
#
# ARGS
#   parameters      GetMenuItemInfo - {http://classes.win32.server.sirius.org/}GetMenuItemInfo
#
# RETURNS
#   parameters      GetMenuItemInfoResponse - {http://classes.win32.server.sirius.org/}GetMenuItemInfoResponse
#
parameters = nil
puts obj.getMenuItemInfo(parameters)

# SYNOPSIS
#   getMenuString(parameters)
#
# ARGS
#   parameters      GetMenuString - {http://classes.win32.server.sirius.org/}GetMenuString
#
# RETURNS
#   parameters      GetMenuStringResponse - {http://classes.win32.server.sirius.org/}GetMenuStringResponse
#
parameters = nil
puts obj.getMenuString(parameters)

# SYNOPSIS
#   pickItem(parameters)
#
# ARGS
#   parameters      PickItem - {http://classes.win32.server.sirius.org/}pickItem
#
# RETURNS
#   parameters      PickItemResponse - {http://classes.win32.server.sirius.org/}pickItemResponse
#
parameters = nil
puts obj.pickItem(parameters)

Sirius::Client::Win32::Core::Menu
