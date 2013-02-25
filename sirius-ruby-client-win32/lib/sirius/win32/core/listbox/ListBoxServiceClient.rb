#!/usr/bin/env ruby
require 'ListBoxServiceDriver.rb'


Sirius::Win32::Core::Listbox

endpoint_url = ARGV.shift
obj = ListBox.new(endpoint_url)

# run ruby with -d to see SOAP wiredumps.
obj.wiredump_dev = STDERR if $DEBUG

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
#   setSel(parameters)
#
# ARGS
#   parameters      SetSel - {http://controls.classes.win32.server.sirius.org/}SetSel
#
# RETURNS
#   parameters      SetSelResponse - {http://controls.classes.win32.server.sirius.org/}SetSelResponse
#
parameters = nil
puts obj.setSel(parameters)

# SYNOPSIS
#   getSel(parameters)
#
# ARGS
#   parameters      GetSel - {http://controls.classes.win32.server.sirius.org/}GetSel
#
# RETURNS
#   parameters      GetSelResponse - {http://controls.classes.win32.server.sirius.org/}GetSelResponse
#
parameters = nil
puts obj.getSel(parameters)

# SYNOPSIS
#   getSelCount(parameters)
#
# ARGS
#   parameters      GetSelCount - {http://controls.classes.win32.server.sirius.org/}GetSelCount
#
# RETURNS
#   parameters      GetSelCountResponse - {http://controls.classes.win32.server.sirius.org/}GetSelCountResponse
#
parameters = nil
puts obj.getSelCount(parameters)

# SYNOPSIS
#   getTopIndex(parameters)
#
# ARGS
#   parameters      GetTopIndex - {http://controls.classes.win32.server.sirius.org/}GetTopIndex
#
# RETURNS
#   parameters      GetTopIndexResponse - {http://controls.classes.win32.server.sirius.org/}GetTopIndexResponse
#
parameters = nil
puts obj.getTopIndex(parameters)

# SYNOPSIS
#   selItemRange(parameters)
#
# ARGS
#   parameters      SelItemRange - {http://controls.classes.win32.server.sirius.org/}SelItemRange
#
# RETURNS
#   parameters      SelItemRangeResponse - {http://controls.classes.win32.server.sirius.org/}SelItemRangeResponse
#
parameters = nil
puts obj.selItemRange(parameters)

# SYNOPSIS
#   getTextLen(parameters)
#
# ARGS
#   parameters      GetTextLen - {http://controls.classes.win32.server.sirius.org/}GetTextLen
#
# RETURNS
#   parameters      GetTextLenResponse - {http://controls.classes.win32.server.sirius.org/}GetTextLenResponse
#
parameters = nil
puts obj.getTextLen(parameters)

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
#   getHorizontalExtent(parameters)
#
# ARGS
#   parameters      GetHorizontalExtent - {http://controls.classes.win32.server.sirius.org/}GetHorizontalExtent
#
# RETURNS
#   parameters      GetHorizontalExtentResponse - {http://controls.classes.win32.server.sirius.org/}GetHorizontalExtentResponse
#
parameters = nil
puts obj.getHorizontalExtent(parameters)

# SYNOPSIS
#   getCaretIndex(parameters)
#
# ARGS
#   parameters      GetCaretIndex - {http://controls.classes.win32.server.sirius.org/}GetCaretIndex
#
# RETURNS
#   parameters      GetCaretIndexResponse - {http://controls.classes.win32.server.sirius.org/}GetCaretIndexResponse
#
parameters = nil
puts obj.getCaretIndex(parameters)

# SYNOPSIS
#   setCaretIndex(parameters)
#
# ARGS
#   parameters      SetCaretIndex - {http://controls.classes.win32.server.sirius.org/}SetCaretIndex
#
# RETURNS
#   parameters      SetCaretIndexResponse - {http://controls.classes.win32.server.sirius.org/}SetCaretIndexResponse
#
parameters = nil
puts obj.setCaretIndex(parameters)




Sirius::Win32::Core::Listbox
