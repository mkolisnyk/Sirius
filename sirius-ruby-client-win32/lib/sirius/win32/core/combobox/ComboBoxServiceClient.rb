#!/usr/bin/env ruby
require 'ComboBoxServiceDriver.rb'

Sirius::Client::Win32::Core::Combobox

endpoint_url = ARGV.shift
obj = ComboBox.new(endpoint_url)

# run ruby with -d to see SOAP wiredumps.
obj.wiredump_dev = STDERR if $DEBUG

# SYNOPSIS
#   getCount(parameters)
#
# ARGS
#   parameters      GetCount - {http://controls.classes.win32.server.sirius.org/}GetCount
#
# RETURNS
#   parameters      GetCountResponse - {http://controls.classes.win32.server.sirius.org/}GetCountResponse
#
parameters = nil
puts obj.getCount(parameters)

# SYNOPSIS
#   getItemData(parameters)
#
# ARGS
#   parameters      GetItemData - {http://controls.classes.win32.server.sirius.org/}GetItemData
#
# RETURNS
#   parameters      GetItemDataResponse - {http://controls.classes.win32.server.sirius.org/}GetItemDataResponse
#
parameters = nil
puts obj.getItemData(parameters)

# SYNOPSIS
#   getLBTextLen(parameters)
#
# ARGS
#   parameters      GetLBTextLen - {http://controls.classes.win32.server.sirius.org/}GetLBTextLen
#
# RETURNS
#   parameters      GetLBTextLenResponse - {http://controls.classes.win32.server.sirius.org/}GetLBTextLenResponse
#
parameters = nil
puts obj.getLBTextLen(parameters)

# SYNOPSIS
#   findString(parameters)
#
# ARGS
#   parameters      FindString - {http://controls.classes.win32.server.sirius.org/}FindString
#
# RETURNS
#   parameters      FindStringResponse - {http://controls.classes.win32.server.sirius.org/}FindStringResponse
#
parameters = nil
puts obj.findString(parameters)

# SYNOPSIS
#   showDropdown(parameters)
#
# ARGS
#   parameters      ShowDropdown - {http://controls.classes.win32.server.sirius.org/}ShowDropdown
#
# RETURNS
#   parameters      ShowDropdownResponse - {http://controls.classes.win32.server.sirius.org/}ShowDropdownResponse
#
parameters = nil
puts obj.showDropdown(parameters)

# SYNOPSIS
#   setText(parameters)
#
# ARGS
#   parameters      SetText - {http://controls.classes.win32.server.sirius.org/}SetText
#
# RETURNS
#   parameters      SetTextResponse - {http://controls.classes.win32.server.sirius.org/}SetTextResponse
#
parameters = nil
puts obj.setText(parameters)

# SYNOPSIS
#   setEditSel(parameters)
#
# ARGS
#   parameters      SetEditSel - {http://controls.classes.win32.server.sirius.org/}SetEditSel
#
# RETURNS
#   parameters      SetEditSelResponse - {http://controls.classes.win32.server.sirius.org/}SetEditSelResponse
#
parameters = nil
puts obj.setEditSel(parameters)

# SYNOPSIS
#   getEditSel(parameters)
#
# ARGS
#   parameters      GetEditSel - {http://controls.classes.win32.server.sirius.org/}GetEditSel
#
# RETURNS
#   parameters      GetEditSelResponse - {http://controls.classes.win32.server.sirius.org/}GetEditSelResponse
#
parameters = nil
puts obj.getEditSel(parameters)

# SYNOPSIS
#   getLBText(parameters)
#
# ARGS
#   parameters      GetLBText - {http://controls.classes.win32.server.sirius.org/}GetLBText
#
# RETURNS
#   parameters      GetLBTextResponse - {http://controls.classes.win32.server.sirius.org/}GetLBTextResponse
#
parameters = nil
puts obj.getLBText(parameters)

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
#   getText(parameters)
#
# ARGS
#   parameters      GetText - {http://controls.classes.win32.server.sirius.org/}GetText
#
# RETURNS
#   parameters      GetTextResponse - {http://controls.classes.win32.server.sirius.org/}GetTextResponse
#
parameters = nil
puts obj.getText(parameters)

# SYNOPSIS
#   resetContent(parameters)
#
# ARGS
#   parameters      ResetContent - {http://controls.classes.win32.server.sirius.org/}ResetContent
#
# RETURNS
#   parameters      ResetContentResponse - {http://controls.classes.win32.server.sirius.org/}ResetContentResponse
#
parameters = nil
puts obj.resetContent(parameters)

# SYNOPSIS
#   selectString(parameters)
#
# ARGS
#   parameters      SelectString - {http://controls.classes.win32.server.sirius.org/}SelectString
#
# RETURNS
#   parameters      SelectStringResponse - {http://controls.classes.win32.server.sirius.org/}SelectStringResponse
#
parameters = nil
puts obj.selectString(parameters)

# SYNOPSIS
#   findItemData(parameters)
#
# ARGS
#   parameters      FindItemData - {http://controls.classes.win32.server.sirius.org/}FindItemData
#
# RETURNS
#   parameters      FindItemDataResponse - {http://controls.classes.win32.server.sirius.org/}FindItemDataResponse
#
parameters = nil
puts obj.findItemData(parameters)

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
#   getTextLength(parameters)
#
# ARGS
#   parameters      GetTextLength - {http://controls.classes.win32.server.sirius.org/}GetTextLength
#
# RETURNS
#   parameters      GetTextLengthResponse - {http://controls.classes.win32.server.sirius.org/}GetTextLengthResponse
#
parameters = nil
puts obj.getTextLength(parameters)

# SYNOPSIS
#   setItemHeight(parameters)
#
# ARGS
#   parameters      SetItemHeight - {http://controls.classes.win32.server.sirius.org/}SetItemHeight
#
# RETURNS
#   parameters      SetItemHeightResponse - {http://controls.classes.win32.server.sirius.org/}SetItemHeightResponse
#
parameters = nil
puts obj.setItemHeight(parameters)

# SYNOPSIS
#   getDroppedState(parameters)
#
# ARGS
#   parameters      GetDroppedState - {http://controls.classes.win32.server.sirius.org/}GetDroppedState
#
# RETURNS
#   parameters      GetDroppedStateResponse - {http://controls.classes.win32.server.sirius.org/}GetDroppedStateResponse
#
parameters = nil
puts obj.getDroppedState(parameters)

# SYNOPSIS
#   getItemHeight(parameters)
#
# ARGS
#   parameters      GetItemHeight - {http://controls.classes.win32.server.sirius.org/}GetItemHeight
#
# RETURNS
#   parameters      GetItemHeightResponse - {http://controls.classes.win32.server.sirius.org/}GetItemHeightResponse
#
parameters = nil
puts obj.getItemHeight(parameters)

# SYNOPSIS
#   findStringExact(parameters)
#
# ARGS
#   parameters      FindStringExact - {http://controls.classes.win32.server.sirius.org/}FindStringExact
#
# RETURNS
#   parameters      FindStringExactResponse - {http://controls.classes.win32.server.sirius.org/}FindStringExactResponse
#
parameters = nil
puts obj.findStringExact(parameters)

# SYNOPSIS
#   getExtendedUI(parameters)
#
# ARGS
#   parameters      GetExtendedUI - {http://controls.classes.win32.server.sirius.org/}GetExtendedUI
#
# RETURNS
#   parameters      GetExtendedUIResponse - {http://controls.classes.win32.server.sirius.org/}GetExtendedUIResponse
#
parameters = nil
puts obj.getExtendedUI(parameters)

Sirius::Client::Win32::Core::Combobox
