#!/usr/bin/env ruby
require 'EditServiceDriver.rb'


Sirius::Win32::Core::Edit

endpoint_url = ARGV.shift
obj = Edit.new(endpoint_url)

# run ruby with -d to see SOAP wiredumps.
obj.wiredump_dev = STDERR if $DEBUG

# SYNOPSIS
#   getModify(parameters)
#
# ARGS
#   parameters      GetModify - {http://controls.classes.win32.server.sirius.org/}GetModify
#
# RETURNS
#   parameters      GetModifyResponse - {http://controls.classes.win32.server.sirius.org/}GetModifyResponse
#
parameters = nil
puts obj.getModify(parameters)

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
#   lineIndex(parameters)
#
# ARGS
#   parameters      LineIndex - {http://controls.classes.win32.server.sirius.org/}LineIndex
#
# RETURNS
#   parameters      LineIndexResponse - {http://controls.classes.win32.server.sirius.org/}LineIndexResponse
#
parameters = nil
puts obj.lineIndex(parameters)

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
#   scrollCaret(parameters)
#
# ARGS
#   parameters      ScrollCaret - {http://controls.classes.win32.server.sirius.org/}ScrollCaret
#
# RETURNS
#   parameters      ScrollCaretResponse - {http://controls.classes.win32.server.sirius.org/}ScrollCaretResponse
#
parameters = nil
puts obj.scrollCaret(parameters)

# SYNOPSIS
#   scroll(parameters)
#
# ARGS
#   parameters      Scroll - {http://controls.classes.win32.server.sirius.org/}Scroll
#
# RETURNS
#   parameters      ScrollResponse - {http://controls.classes.win32.server.sirius.org/}ScrollResponse
#
parameters = nil
puts obj.scroll(parameters)

# SYNOPSIS
#   lineFromChar(parameters)
#
# ARGS
#   parameters      LineFromChar - {http://controls.classes.win32.server.sirius.org/}LineFromChar
#
# RETURNS
#   parameters      LineFromCharResponse - {http://controls.classes.win32.server.sirius.org/}LineFromCharResponse
#
parameters = nil
puts obj.lineFromChar(parameters)

# SYNOPSIS
#   replaceSel(parameters)
#
# ARGS
#   parameters      ReplaceSel - {http://controls.classes.win32.server.sirius.org/}ReplaceSel
#
# RETURNS
#   parameters      ReplaceSelResponse - {http://controls.classes.win32.server.sirius.org/}ReplaceSelResponse
#
parameters = nil
puts obj.replaceSel(parameters)

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
#   getLineCount(parameters)
#
# ARGS
#   parameters      GetLineCount - {http://controls.classes.win32.server.sirius.org/}GetLineCount
#
# RETURNS
#   parameters      GetLineCountResponse - {http://controls.classes.win32.server.sirius.org/}GetLineCountResponse
#
parameters = nil
puts obj.getLineCount(parameters)

# SYNOPSIS
#   canUndo(parameters)
#
# ARGS
#   parameters      CanUndo - {http://controls.classes.win32.server.sirius.org/}CanUndo
#
# RETURNS
#   parameters      CanUndoResponse - {http://controls.classes.win32.server.sirius.org/}CanUndoResponse
#
parameters = nil
puts obj.canUndo(parameters)

# SYNOPSIS
#   lineLength(parameters)
#
# ARGS
#   parameters      LineLength - {http://controls.classes.win32.server.sirius.org/}LineLength
#
# RETURNS
#   parameters      LineLengthResponse - {http://controls.classes.win32.server.sirius.org/}LineLengthResponse
#
parameters = nil
puts obj.lineLength(parameters)

# SYNOPSIS
#   emptyUndoBuffer(parameters)
#
# ARGS
#   parameters      EmptyUndoBuffer - {http://controls.classes.win32.server.sirius.org/}EmptyUndoBuffer
#
# RETURNS
#   parameters      EmptyUndoBufferResponse - {http://controls.classes.win32.server.sirius.org/}EmptyUndoBufferResponse
#
parameters = nil
puts obj.emptyUndoBuffer(parameters)

# SYNOPSIS
#   getFirstVisibleLine(parameters)
#
# ARGS
#   parameters      GetFirstVisibleLine - {http://controls.classes.win32.server.sirius.org/}GetFirstVisibleLine
#
# RETURNS
#   parameters      GetFirstVisibleLineResponse - {http://controls.classes.win32.server.sirius.org/}GetFirstVisibleLineResponse
#
parameters = nil
puts obj.getFirstVisibleLine(parameters)

# SYNOPSIS
#   getPasswordChar(parameters)
#
# ARGS
#   parameters      GetPasswordChar - {http://controls.classes.win32.server.sirius.org/}GetPasswordChar
#
# RETURNS
#   parameters      GetPasswordCharResponse - {http://controls.classes.win32.server.sirius.org/}GetPasswordCharResponse
#
parameters = nil
puts obj.getPasswordChar(parameters)

# SYNOPSIS
#   setPasswordChar(parameters)
#
# ARGS
#   parameters      SetPasswordChar - {http://controls.classes.win32.server.sirius.org/}SetPasswordChar
#
# RETURNS
#   parameters      SetPasswordCharResponse - {http://controls.classes.win32.server.sirius.org/}SetPasswordCharResponse
#
parameters = nil
puts obj.setPasswordChar(parameters)

# SYNOPSIS
#   undo(parameters)
#
# ARGS
#   parameters      Undo - {http://controls.classes.win32.server.sirius.org/}Undo
#
# RETURNS
#   parameters      UndoResponse - {http://controls.classes.win32.server.sirius.org/}UndoResponse
#
parameters = nil
puts obj.undo(parameters)




Sirius::Win32::Core::Edit
