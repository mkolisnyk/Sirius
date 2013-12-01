module Sirius
  module Client
    module Win32
      module Classes
        module Controls
          class Edit < Control
            def initialize(locator, parent = nil)
              super(locator, parent)
            end

            # SYNOPSIS
            #   emptyUndoBuffer(parameters)
            #
            # ARGS
            #   parameters      EmptyUndoBuffer - {http://controls.classes.win32.server.sirius.org/}emptyUndoBuffer
            #
            # RETURNS
            #   parameters      EmptyUndoBufferResponse - {http://controls.classes.win32.server.sirius.org/}emptyUndoBufferResponse
            #
            def empty_undo_buffer
              @client.core.edit.emptyUndoBuffer(parameters)
            end

            # SYNOPSIS
            #   getFirstVisibleLine(parameters)
            #
            # ARGS
            #   parameters      GetFirstVisibleLine - {http://controls.classes.win32.server.sirius.org/}getFirstVisibleLine
            #
            # RETURNS
            #   parameters      GetFirstVisibleLineResponse - {http://controls.classes.win32.server.sirius.org/}getFirstVisibleLineResponse
            #
            def get_first_visible_line
              @client.core.edit.getFirstVisibleLine(parameters)
            end

            # SYNOPSIS
            #   getPasswordChar(parameters)
            #
            # ARGS
            #   parameters      GetPasswordChar - {http://controls.classes.win32.server.sirius.org/}getPasswordChar
            #
            # RETURNS
            #   parameters      GetPasswordCharResponse - {http://controls.classes.win32.server.sirius.org/}getPasswordCharResponse
            #
            def get_password_char
              @client.core.edit.getPasswordChar(parameters)
            end

            # SYNOPSIS
            #   setPasswordChar(parameters)
            #
            # ARGS
            #   parameters      SetPasswordChar - {http://controls.classes.win32.server.sirius.org/}setPasswordChar
            #
            # RETURNS
            #   parameters      SetPasswordCharResponse - {http://controls.classes.win32.server.sirius.org/}setPasswordCharResponse
            #
            def set_password_char
              @client.core.edit.setPasswordChar(parameters)
            end

            # SYNOPSIS
            #   getSel(parameters)
            #
            # ARGS
            #   parameters      GetSel - {http://controls.classes.win32.server.sirius.org/}getSel
            #
            # RETURNS
            #   parameters      GetSelResponse - {http://controls.classes.win32.server.sirius.org/}getSelResponse
            #
            def get_sel
              @client.core.edit.getSel(parameters)
            end

            # SYNOPSIS
            #   getModify(parameters)
            #
            # ARGS
            #   parameters      GetModify - {http://controls.classes.win32.server.sirius.org/}getModify
            #
            # RETURNS
            #   parameters      GetModifyResponse - {http://controls.classes.win32.server.sirius.org/}getModifyResponse
            #
            def get_modify
              @client.core.edit.getModify(parameters)
            end

            # SYNOPSIS
            #   lineFromChar(parameters)
            #
            # ARGS
            #   parameters      LineFromChar - {http://controls.classes.win32.server.sirius.org/}lineFromChar
            #
            # RETURNS
            #   parameters      LineFromCharResponse - {http://controls.classes.win32.server.sirius.org/}lineFromCharResponse
            #
            def line_from_char
              @client.core.edit.lineFromChar(parameters)
            end

            # SYNOPSIS
            #   lineIndex(parameters)
            #
            # ARGS
            #   parameters      LineIndex - {http://controls.classes.win32.server.sirius.org/}lineIndex
            #
            # RETURNS
            #   parameters      LineIndexResponse - {http://controls.classes.win32.server.sirius.org/}lineIndexResponse
            #
            def line_index
              @client.core.edit.lineIndex(parameters)
            end

            # SYNOPSIS
            #   lineLength(parameters)
            #
            # ARGS
            #   parameters      LineLength - {http://controls.classes.win32.server.sirius.org/}lineLength
            #
            # RETURNS
            #   parameters      LineLengthResponse - {http://controls.classes.win32.server.sirius.org/}lineLengthResponse
            #
            def line_length
              @client.core.edit.lineLength(parameters)
            end

            # SYNOPSIS
            #   replaceSel(parameters)
            #
            # ARGS
            #   parameters      ReplaceSel - {http://controls.classes.win32.server.sirius.org/}replaceSel
            #
            # RETURNS
            #   parameters      ReplaceSelResponse - {http://controls.classes.win32.server.sirius.org/}replaceSelResponse
            #
            def replace_sel
              @client.core.edit.replaceSel(parameters)
            end

            # SYNOPSIS
            #   scrollCaret(parameters)
            #
            # ARGS
            #   parameters      ScrollCaret - {http://controls.classes.win32.server.sirius.org/}scrollCaret
            #
            # RETURNS
            #   parameters      ScrollCaretResponse - {http://controls.classes.win32.server.sirius.org/}scrollCaretResponse
            #
            def scroll_caret
              @client.core.edit.scrollCaret(parameters)
            end

            # SYNOPSIS
            #   setSel(parameters)
            #
            # ARGS
            #   parameters      SetSel - {http://controls.classes.win32.server.sirius.org/}setSel
            #
            # RETURNS
            #   parameters      SetSelResponse - {http://controls.classes.win32.server.sirius.org/}setSelResponse
            #
            def set_sel
              @client.core.edit.setSel(parameters)
            end

            # SYNOPSIS
            #   getText(parameters)
            #
            # ARGS
            #   parameters      GetText - {http://controls.classes.win32.server.sirius.org/}getText
            #
            # RETURNS
            #   parameters      GetTextResponse - {http://controls.classes.win32.server.sirius.org/}getTextResponse
            #
            def get_text
              @client.core.edit.getText(parameters)
            end

            # SYNOPSIS
            #   setText(parameters)
            #
            # ARGS
            #   parameters      SetText - {http://controls.classes.win32.server.sirius.org/}setText
            #
            # RETURNS
            #   parameters      SetTextResponse - {http://controls.classes.win32.server.sirius.org/}setTextResponse
            #
            def set_text
              @client.core.edit.setText(parameters)
            end

            # SYNOPSIS
            #   undo(parameters)
            #
            # ARGS
            #   parameters      Undo - {http://controls.classes.win32.server.sirius.org/}undo
            #
            # RETURNS
            #   parameters      UndoResponse - {http://controls.classes.win32.server.sirius.org/}undoResponse
            #
            def undo
              @client.core.edit.undo(parameters)
            end

            # SYNOPSIS
            #   canUndo(parameters)
            #
            # ARGS
            #   parameters      CanUndo - {http://controls.classes.win32.server.sirius.org/}canUndo
            #
            # RETURNS
            #   parameters      CanUndoResponse - {http://controls.classes.win32.server.sirius.org/}canUndoResponse
            #
            def can_undo
              @client.core.edit.canUndo(parameters)
            end

            # SYNOPSIS
            #   getLineCount(parameters)
            #
            # ARGS
            #   parameters      GetLineCount - {http://controls.classes.win32.server.sirius.org/}getLineCount
            #
            # RETURNS
            #   parameters      GetLineCountResponse - {http://controls.classes.win32.server.sirius.org/}getLineCountResponse
            #
            def get_line_count
              @client.core.edit.getLineCount(parameters)
            end

            # SYNOPSIS
            #   scroll(parameters)
            #
            # ARGS
            #   parameters      Scroll - {http://controls.classes.win32.server.sirius.org/}scroll
            #
            # RETURNS
            #   parameters      ScrollResponse - {http://controls.classes.win32.server.sirius.org/}scrollResponse
            #
            def scroll
              @client.core.edit.scroll(parameters)
            end

          end
        end
      end
    end
  end
end