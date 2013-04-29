#!/usr/bin/env ruby
require 'sirius/win32/core/dialog/DialogServiceDriver.rb'

Sirius::Client::Win32::Core::Dialog

endpoint_url = ARGV.shift
obj = Dialog.new(endpoint_url)

# run ruby with -d to see SOAP wiredumps.
obj.wiredump_dev = STDERR if $DEBUG

# SYNOPSIS
#   getDlgCtrlID(parameters)
#
# ARGS
#   parameters      GetDlgCtrlID - {http://classes.win32.server.sirius.org/}getDlgCtrlID
#
# RETURNS
#   parameters      GetDlgCtrlIDResponse - {http://classes.win32.server.sirius.org/}getDlgCtrlIDResponse
#
parameters = nil
puts obj.getDlgCtrlID(parameters)

# SYNOPSIS
#   getDlgItem(parameters)
#
# ARGS
#   parameters      GetDlgItem - {http://classes.win32.server.sirius.org/}getDlgItem
#
# RETURNS
#   parameters      GetDlgItemResponse - {http://classes.win32.server.sirius.org/}getDlgItemResponse
#
parameters = nil
puts obj.getDlgItem(parameters)

# SYNOPSIS
#   getDialogBaseUnits(parameters)
#
# ARGS
#   parameters      GetDialogBaseUnits - {http://classes.win32.server.sirius.org/}getDialogBaseUnits
#
# RETURNS
#   parameters      GetDialogBaseUnitsResponse - {http://classes.win32.server.sirius.org/}getDialogBaseUnitsResponse
#
parameters = nil
puts obj.getDialogBaseUnits(parameters)

# SYNOPSIS
#   getDlgItemInt(parameters)
#
# ARGS
#   parameters      GetDlgItemInt - {http://classes.win32.server.sirius.org/}getDlgItemInt
#
# RETURNS
#   parameters      GetDlgItemIntResponse - {http://classes.win32.server.sirius.org/}getDlgItemIntResponse
#
parameters = nil
puts obj.getDlgItemInt(parameters)

# SYNOPSIS
#   getDlgItemTextA(parameters)
#
# ARGS
#   parameters      GetDlgItemTextA - {http://classes.win32.server.sirius.org/}getDlgItemTextA
#
# RETURNS
#   parameters      GetDlgItemTextAResponse - {http://classes.win32.server.sirius.org/}getDlgItemTextAResponse
#
parameters = nil
puts obj.getDlgItemTextA(parameters)

# SYNOPSIS
#   isDlgButtonChecked(parameters)
#
# ARGS
#   parameters      IsDlgButtonChecked - {http://classes.win32.server.sirius.org/}isDlgButtonChecked
#
# RETURNS
#   parameters      IsDlgButtonCheckedResponse - {http://classes.win32.server.sirius.org/}isDlgButtonCheckedResponse
#
parameters = nil
puts obj.isDlgButtonChecked(parameters)

# SYNOPSIS
#   setDlgItemInt(parameters)
#
# ARGS
#   parameters      SetDlgItemInt - {http://classes.win32.server.sirius.org/}setDlgItemInt
#
# RETURNS
#   parameters      SetDlgItemIntResponse - {http://classes.win32.server.sirius.org/}setDlgItemIntResponse
#
parameters = nil
puts obj.setDlgItemInt(parameters)

# SYNOPSIS
#   setDlgItemText(parameters)
#
# ARGS
#   parameters      SetDlgItemText - {http://classes.win32.server.sirius.org/}setDlgItemText
#
# RETURNS
#   parameters      SetDlgItemTextResponse - {http://classes.win32.server.sirius.org/}setDlgItemTextResponse
#
parameters = nil
puts obj.setDlgItemText(parameters)

Sirius::Client::Win32::Core::Dialog
