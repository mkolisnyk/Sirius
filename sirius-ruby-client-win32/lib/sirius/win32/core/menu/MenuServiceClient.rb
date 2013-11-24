#!/usr/bin/env ruby
require 'MenuServiceDriver.rb'


Sirius::Client::Win32::Core::Menu

endpoint_url = ARGV.shift
obj = Menu.new(endpoint_url)

# run ruby with -d to see SOAP wiredumps.
obj.wiredump_dev = STDERR if $DEBUG

# SYNOPSIS
#   getMenuInfo(parameters)
#
# ARGS
#   parameters      GetMenuInfo - {http://classes.win32.server.sirius.org/}getMenuInfo
#
# RETURNS
#   parameters      GetMenuInfoResponse - {http://classes.win32.server.sirius.org/}getMenuInfoResponse
#
parameters = nil
puts obj.getMenuInfo(parameters)

# SYNOPSIS
#   getMenuState(parameters)
#
# ARGS
#   parameters      GetMenuState - {http://classes.win32.server.sirius.org/}getMenuState
#
# RETURNS
#   parameters      GetMenuStateResponse - {http://classes.win32.server.sirius.org/}getMenuStateResponse
#
parameters = nil
puts obj.getMenuState(parameters)

# SYNOPSIS
#   getSubMenu(parameters)
#
# ARGS
#   parameters      GetSubMenu - {http://classes.win32.server.sirius.org/}getSubMenu
#
# RETURNS
#   parameters      GetSubMenuResponse - {http://classes.win32.server.sirius.org/}getSubMenuResponse
#
parameters = nil
puts obj.getSubMenu(parameters)

# SYNOPSIS
#   isMenu(parameters)
#
# ARGS
#   parameters      IsMenu - {http://classes.win32.server.sirius.org/}isMenu
#
# RETURNS
#   parameters      IsMenuResponse - {http://classes.win32.server.sirius.org/}isMenuResponse
#
parameters = nil
puts obj.isMenu(parameters)

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

# SYNOPSIS
#   getMenuDefaultItem(parameters)
#
# ARGS
#   parameters      GetMenuDefaultItem - {http://classes.win32.server.sirius.org/}getMenuDefaultItem
#
# RETURNS
#   parameters      GetMenuDefaultItemResponse - {http://classes.win32.server.sirius.org/}getMenuDefaultItemResponse
#
parameters = nil
puts obj.getMenuDefaultItem(parameters)

# SYNOPSIS
#   getMenuItemCount(parameters)
#
# ARGS
#   parameters      GetMenuItemCount - {http://classes.win32.server.sirius.org/}getMenuItemCount
#
# RETURNS
#   parameters      GetMenuItemCountResponse - {http://classes.win32.server.sirius.org/}getMenuItemCountResponse
#
parameters = nil
puts obj.getMenuItemCount(parameters)

# SYNOPSIS
#   getMenuItemID(parameters)
#
# ARGS
#   parameters      GetMenuItemID - {http://classes.win32.server.sirius.org/}getMenuItemID
#
# RETURNS
#   parameters      GetMenuItemIDResponse - {http://classes.win32.server.sirius.org/}getMenuItemIDResponse
#
parameters = nil
puts obj.getMenuItemID(parameters)

# SYNOPSIS
#   getMenuItemInfo(parameters)
#
# ARGS
#   parameters      GetMenuItemInfo - {http://classes.win32.server.sirius.org/}getMenuItemInfo
#
# RETURNS
#   parameters      GetMenuItemInfoResponse - {http://classes.win32.server.sirius.org/}getMenuItemInfoResponse
#
parameters = nil
puts obj.getMenuItemInfo(parameters)

# SYNOPSIS
#   getMenuItemRect(parameters)
#
# ARGS
#   parameters      GetMenuItemRect - {http://classes.win32.server.sirius.org/}getMenuItemRect
#
# RETURNS
#   parameters      GetMenuItemRectResponse - {http://classes.win32.server.sirius.org/}getMenuItemRectResponse
#
parameters = nil
puts obj.getMenuItemRect(parameters)

# SYNOPSIS
#   getMenuString(parameters)
#
# ARGS
#   parameters      GetMenuString - {http://classes.win32.server.sirius.org/}getMenuString
#
# RETURNS
#   parameters      GetMenuStringResponse - {http://classes.win32.server.sirius.org/}getMenuStringResponse
#
parameters = nil
puts obj.getMenuString(parameters)




Sirius::Client::Win32::Core::Menu
