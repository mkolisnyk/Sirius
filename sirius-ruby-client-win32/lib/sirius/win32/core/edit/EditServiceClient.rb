#!/usr/bin/env ruby
require 'EditServiceDriver.rb'


Sirius::Client::Win32::Core::Edit

endpoint_url = ARGV.shift
obj = Edit.new(endpoint_url)

# run ruby with -d to see SOAP wiredumps.
obj.wiredump_dev = STDERR if $DEBUG

# SYNOPSIS
#   emptyUndoBuffer(parameters)
#
# ARGS
#   parameters      EmptyUndoBuffer - {http://controls.classes.win32.server.sirius.org/}emptyUndoBuffer
#
# RETURNS
#   parameters      EmptyUndoBufferResponse - {http://controls.classes.win32.server.sirius.org/}emptyUndoBufferResponse
#
parameters = nil
puts obj.emptyUndoBuffer(parameters)

# SYNOPSIS
#   getFirstVisibleLine(parameters)
#
# ARGS
#   parameters      GetFirstVisibleLine - {http://controls.classes.win32.server.sirius.org/}getFirstVisibleLine
#
# RETURNS
#   parameters      GetFirstVisibleLineResponse - {http://controls.classes.win32.server.sirius.org/}getFirstVisibleLineResponse
#
parameters = nil
puts obj.getFirstVisibleLine(parameters)

# SYNOPSIS
#   getPasswordChar(parameters)
#
# ARGS
#   parameters      GetPasswordChar - {http://controls.classes.win32.server.sirius.org/}getPasswordChar
#
# RETURNS
#   parameters      GetPasswordCharResponse - {http://controls.classes.win32.server.sirius.org/}getPasswordCharResponse
#
parameters = nil
puts obj.getPasswordChar(parameters)

# SYNOPSIS
#   setPasswordChar(parameters)
#
# ARGS
#   parameters      SetPasswordChar - {http://controls.classes.win32.server.sirius.org/}setPasswordChar
#
# RETURNS
#   parameters      SetPasswordCharResponse - {http://controls.classes.win32.server.sirius.org/}setPasswordCharResponse
#
parameters = nil
puts obj.setPasswordChar(parameters)

# SYNOPSIS
#   getSel(parameters)
#
# ARGS
#   parameters      GetSel - {http://controls.classes.win32.server.sirius.org/}getSel
#
# RETURNS
#   parameters      GetSelResponse - {http://controls.classes.win32.server.sirius.org/}getSelResponse
#
parameters = nil
puts obj.getSel(parameters)

# SYNOPSIS
#   getModify(parameters)
#
# ARGS
#   parameters      GetModify - {http://controls.classes.win32.server.sirius.org/}getModify
#
# RETURNS
#   parameters      GetModifyResponse - {http://controls.classes.win32.server.sirius.org/}getModifyResponse
#
parameters = nil
puts obj.getModify(parameters)

# SYNOPSIS
#   lineFromChar(parameters)
#
# ARGS
#   parameters      LineFromChar - {http://controls.classes.win32.server.sirius.org/}lineFromChar
#
# RETURNS
#   parameters      LineFromCharResponse - {http://controls.classes.win32.server.sirius.org/}lineFromCharResponse
#
parameters = nil
puts obj.lineFromChar(parameters)

# SYNOPSIS
#   lineIndex(parameters)
#
# ARGS
#   parameters      LineIndex - {http://controls.classes.win32.server.sirius.org/}lineIndex
#
# RETURNS
#   parameters      LineIndexResponse - {http://controls.classes.win32.server.sirius.org/}lineIndexResponse
#
parameters = nil
puts obj.lineIndex(parameters)

# SYNOPSIS
#   lineLength(parameters)
#
# ARGS
#   parameters      LineLength - {http://controls.classes.win32.server.sirius.org/}lineLength
#
# RETURNS
#   parameters      LineLengthResponse - {http://controls.classes.win32.server.sirius.org/}lineLengthResponse
#
parameters = nil
puts obj.lineLength(parameters)

# SYNOPSIS
#   replaceSel(parameters)
#
# ARGS
#   parameters      ReplaceSel - {http://controls.classes.win32.server.sirius.org/}replaceSel
#
# RETURNS
#   parameters      ReplaceSelResponse - {http://controls.classes.win32.server.sirius.org/}replaceSelResponse
#
parameters = nil
puts obj.replaceSel(parameters)

# SYNOPSIS
#   scrollCaret(parameters)
#
# ARGS
#   parameters      ScrollCaret - {http://controls.classes.win32.server.sirius.org/}scrollCaret
#
# RETURNS
#   parameters      ScrollCaretResponse - {http://controls.classes.win32.server.sirius.org/}scrollCaretResponse
#
parameters = nil
puts obj.scrollCaret(parameters)

# SYNOPSIS
#   setSel(parameters)
#
# ARGS
#   parameters      SetSel - {http://controls.classes.win32.server.sirius.org/}setSel
#
# RETURNS
#   parameters      SetSelResponse - {http://controls.classes.win32.server.sirius.org/}setSelResponse
#
parameters = nil
puts obj.setSel(parameters)

# SYNOPSIS
#   getText(parameters)
#
# ARGS
#   parameters      GetText - {http://controls.classes.win32.server.sirius.org/}getText
#
# RETURNS
#   parameters      GetTextResponse - {http://controls.classes.win32.server.sirius.org/}getTextResponse
#
parameters = nil
puts obj.getText(parameters)

# SYNOPSIS
#   setText(parameters)
#
# ARGS
#   parameters      SetText - {http://controls.classes.win32.server.sirius.org/}setText
#
# RETURNS
#   parameters      SetTextResponse - {http://controls.classes.win32.server.sirius.org/}setTextResponse
#
parameters = nil
puts obj.setText(parameters)

# SYNOPSIS
#   undo(parameters)
#
# ARGS
#   parameters      Undo - {http://controls.classes.win32.server.sirius.org/}undo
#
# RETURNS
#   parameters      UndoResponse - {http://controls.classes.win32.server.sirius.org/}undoResponse
#
parameters = nil
puts obj.undo(parameters)

# SYNOPSIS
#   canUndo(parameters)
#
# ARGS
#   parameters      CanUndo - {http://controls.classes.win32.server.sirius.org/}canUndo
#
# RETURNS
#   parameters      CanUndoResponse - {http://controls.classes.win32.server.sirius.org/}canUndoResponse
#
parameters = nil
puts obj.canUndo(parameters)

# SYNOPSIS
#   getLineCount(parameters)
#
# ARGS
#   parameters      GetLineCount - {http://controls.classes.win32.server.sirius.org/}getLineCount
#
# RETURNS
#   parameters      GetLineCountResponse - {http://controls.classes.win32.server.sirius.org/}getLineCountResponse
#
parameters = nil
puts obj.getLineCount(parameters)

# SYNOPSIS
#   scroll(parameters)
#
# ARGS
#   parameters      Scroll - {http://controls.classes.win32.server.sirius.org/}scroll
#
# RETURNS
#   parameters      ScrollResponse - {http://controls.classes.win32.server.sirius.org/}scrollResponse
#
parameters = nil
puts obj.scroll(parameters)




Sirius::Client::Win32::Core::Edit
