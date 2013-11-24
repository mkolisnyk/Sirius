#!/usr/bin/env ruby
require 'TabControlServiceDriver.rb'


Sirius::Client::Win32::Core::Tabcontrol

endpoint_url = ARGV.shift
obj = TabControl.new(endpoint_url)

# run ruby with -d to see SOAP wiredumps.
obj.wiredump_dev = STDERR if $DEBUG

# SYNOPSIS
#   getSelectedItem(parameters)
#
# ARGS
#   parameters      GetSelectedItem - {http://controls.classes.win32.server.sirius.org/}GetSelectedItem
#
# RETURNS
#   parameters      GetSelectedItemResponse - {http://controls.classes.win32.server.sirius.org/}GetSelectedItemResponse
#
parameters = nil
puts obj.getSelectedItem(parameters)

# SYNOPSIS
#   selectByIndex(parameters)
#
# ARGS
#   parameters      SelectByIndex - {http://controls.classes.win32.server.sirius.org/}SelectByIndex
#
# RETURNS
#   parameters      SelectByIndexResponse - {http://controls.classes.win32.server.sirius.org/}SelectByIndexResponse
#
parameters = nil
puts obj.selectByIndex(parameters)

# SYNOPSIS
#   getItemNames(parameters)
#
# ARGS
#   parameters      GetItemNames - {http://controls.classes.win32.server.sirius.org/}GetItemNames
#
# RETURNS
#   parameters      GetItemNamesResponse - {http://controls.classes.win32.server.sirius.org/}GetItemNamesResponse
#
parameters = nil
puts obj.getItemNames(parameters)

# SYNOPSIS
#   getCurSel(parameters)
#
# ARGS
#   parameters      GetCurSel - {http://controls.classes.win32.server.sirius.org/}GetCurSel
#
# RETURNS
#   parameters      GetCurSelResponse - {http://controls.classes.win32.server.sirius.org/}GetCurSelResponse
#
parameters = nil
puts obj.getCurSel(parameters)

# SYNOPSIS
#   setCurFocus(parameters)
#
# ARGS
#   parameters      SetCurFocus - {http://controls.classes.win32.server.sirius.org/}SetCurFocus
#
# RETURNS
#   parameters      SetCurFocusResponse - {http://controls.classes.win32.server.sirius.org/}SetCurFocusResponse
#
parameters = nil
puts obj.setCurFocus(parameters)

# SYNOPSIS
#   getItemRect(parameters)
#
# ARGS
#   parameters      GetItemRect - {http://controls.classes.win32.server.sirius.org/}GetItemRect
#
# RETURNS
#   parameters      GetItemRectResponse - {http://controls.classes.win32.server.sirius.org/}GetItemRectResponse
#
parameters = nil
puts obj.getItemRect(parameters)

# SYNOPSIS
#   setCurSel(parameters)
#
# ARGS
#   parameters      SetCurSel - {http://controls.classes.win32.server.sirius.org/}SetCurSel
#
# RETURNS
#   parameters      SetCurSelResponse - {http://controls.classes.win32.server.sirius.org/}SetCurSelResponse
#
parameters = nil
puts obj.setCurSel(parameters)

# SYNOPSIS
#   getCurFocus(parameters)
#
# ARGS
#   parameters      GetCurFocus - {http://controls.classes.win32.server.sirius.org/}GetCurFocus
#
# RETURNS
#   parameters      GetCurFocusResponse - {http://controls.classes.win32.server.sirius.org/}GetCurFocusResponse
#
parameters = nil
puts obj.getCurFocus(parameters)

# SYNOPSIS
#   select(parameters)
#
# ARGS
#   parameters      Select - {http://controls.classes.win32.server.sirius.org/}Select
#
# RETURNS
#   parameters      SelectResponse - {http://controls.classes.win32.server.sirius.org/}SelectResponse
#
parameters = nil
puts obj.select(parameters)

# SYNOPSIS
#   hitTest(parameters)
#
# ARGS
#   parameters      HitTest - {http://controls.classes.win32.server.sirius.org/}HitTest
#
# RETURNS
#   parameters      HitTestResponse - {http://controls.classes.win32.server.sirius.org/}HitTestResponse
#
parameters = nil
puts obj.hitTest(parameters)

# SYNOPSIS
#   getItemCount(parameters)
#
# ARGS
#   parameters      GetItemCount - {http://controls.classes.win32.server.sirius.org/}GetItemCount
#
# RETURNS
#   parameters      GetItemCountResponse - {http://controls.classes.win32.server.sirius.org/}GetItemCountResponse
#
parameters = nil
puts obj.getItemCount(parameters)

# SYNOPSIS
#   getRowCount(parameters)
#
# ARGS
#   parameters      GetRowCount - {http://controls.classes.win32.server.sirius.org/}GetRowCount
#
# RETURNS
#   parameters      GetRowCountResponse - {http://controls.classes.win32.server.sirius.org/}GetRowCountResponse
#
parameters = nil
puts obj.getRowCount(parameters)

# SYNOPSIS
#   getItem(parameters)
#
# ARGS
#   parameters      GetItem - {http://controls.classes.win32.server.sirius.org/}GetItem
#
# RETURNS
#   parameters      GetItemResponse - {http://controls.classes.win32.server.sirius.org/}GetItemResponse
#
parameters = nil
puts obj.getItem(parameters)




Sirius::Client::Win32::Core::Tabcontrol
