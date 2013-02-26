require 'xsd/qname'

module Sirius; module Client; module Win32; module Core; module Edit

          # {http:controls.classes.win32.server.sirius.org/}ReplaceSel
          #   arg0 - SOAP::SOAPLong
          #   arg1 - SOAP::SOAPString          class ReplaceSel
            attr_accessor :arg0
            attr_accessor :arg1
            def initialize(arg0 = nil, arg1 = nil)  @arg0 = arg0
              @arg1 = arg1
            end
          end
          # {http:controls.classes.win32.server.sirius.org/}ReplaceSelResponse
          #   m_return - SOAP::SOAPInt
          class ReplaceSelResponse            def m_return
              @v_return
            end

            def m_return=(value)  @v_return = value
            end

            def initialize(v_return = nil)  @v_return = v_return
            end
          end
          # {http:controls.classes.win32.server.sirius.org/}LineLength
          #   arg0 - SOAP::SOAPLong
          #   arg1 - SOAP::SOAPInt
          class LineLength
            attr_accessor :arg0
            attr_accessor :arg1
            def initialize(arg0 = nil, arg1 = nil)  @arg0 = arg0
              @arg1 = arg1
            end
          end
          # {http:controls.classes.win32.server.sirius.org/}LineLengthResponse
          #   m_return - SOAP::SOAPInt
          class LineLengthResponse            def m_return
              @v_return
            end

            def m_return=(value)  @v_return = value
            end

            def initialize(v_return = nil)  @v_return = v_return
            end
          end
          # {http:controls.classes.win32.server.sirius.org/}LineIndex
          #   arg0 - SOAP::SOAPLong
          #   arg1 - SOAP::SOAPInt
          class LineIndex
            attr_accessor :arg0
            attr_accessor :arg1
            def initialize(arg0 = nil, arg1 = nil)  @arg0 = arg0
              @arg1 = arg1
            end
          end
          # {http:controls.classes.win32.server.sirius.org/}LineIndexResponse
          #   m_return - SOAP::SOAPInt
          class LineIndexResponse            def m_return
              @v_return
            end

            def m_return=(value)  @v_return = value
            end

            def initialize(v_return = nil)  @v_return = v_return
            end
          end
          # {http:controls.classes.win32.server.sirius.org/}Undo
          #   arg0 - SOAP::SOAPLong
          class Undo
            attr_accessor :arg0
            def initialize(arg0 = nil)  @arg0 = arg0
            end
          end
          # {http:controls.classes.win32.server.sirius.org/}UndoResponse
          #   m_return - SOAP::SOAPInt
          class UndoResponse            def m_return
              @v_return
            end

            def m_return=(value)  @v_return = value
            end

            def initialize(v_return = nil)  @v_return = v_return
            end
          end
          # {http:controls.classes.win32.server.sirius.org/}LineFromChar
          #   arg0 - SOAP::SOAPLong
          #   arg1 - SOAP::SOAPInt
          class LineFromChar
            attr_accessor :arg0
            attr_accessor :arg1
            def initialize(arg0 = nil, arg1 = nil)  @arg0 = arg0
              @arg1 = arg1
            end
          end
          # {http:controls.classes.win32.server.sirius.org/}LineFromCharResponse
          #   m_return - SOAP::SOAPInt
          class LineFromCharResponse            def m_return
              @v_return
            end

            def m_return=(value)  @v_return = value
            end

            def initialize(v_return = nil)  @v_return = v_return
            end
          end
          # {http:controls.classes.win32.server.sirius.org/}GetFirstVisibleLine
          #   arg0 - SOAP::SOAPLong
          class GetFirstVisibleLine
            attr_accessor :arg0
            def initialize(arg0 = nil)  @arg0 = arg0
            end
          end
          # {http:controls.classes.win32.server.sirius.org/}GetFirstVisibleLineResponse
          #   m_return - SOAP::SOAPInt
          class GetFirstVisibleLineResponse            def m_return
              @v_return
            end

            def m_return=(value)  @v_return = value
            end

            def initialize(v_return = nil)  @v_return = v_return
            end
          end
          # {http:controls.classes.win32.server.sirius.org/}EmptyUndoBuffer
          #   arg0 - SOAP::SOAPLong
          class EmptyUndoBuffer
            attr_accessor :arg0
            def initialize(arg0 = nil)  @arg0 = arg0
            end
          end
          # {http:controls.classes.win32.server.sirius.org/}EmptyUndoBufferResponse
          #   m_return - SOAP::SOAPInt
          class EmptyUndoBufferResponse            def m_return
              @v_return
            end

            def m_return=(value)  @v_return = value
            end

            def initialize(v_return = nil)  @v_return = v_return
            end
          end
          # {http:controls.classes.win32.server.sirius.org/}SetText
          #   arg0 - SOAP::SOAPLong
          #   arg1 - SOAP::SOAPString
          class SetText
            attr_accessor :arg0
            attr_accessor :arg1
            def initialize(arg0 = nil, arg1 = nil)  @arg0 = arg0
              @arg1 = arg1
            end
          end
          # {http:controls.classes.win32.server.sirius.org/}SetTextResponse
          #   m_return - SOAP::SOAPBoolean
          class SetTextResponse            def m_return
              @v_return
            end

            def m_return=(value)  @v_return = value
            end

            def initialize(v_return = nil)  @v_return = v_return
            end
          end
          # {http:controls.classes.win32.server.sirius.org/}SetPasswordChar
          #   arg0 - SOAP::SOAPLong
          #   arg1 - SOAP::SOAPInt
          class SetPasswordChar
            attr_accessor :arg0
            attr_accessor :arg1
            def initialize(arg0 = nil, arg1 = nil)  @arg0 = arg0
              @arg1 = arg1
            end
          end
          # {http:controls.classes.win32.server.sirius.org/}SetPasswordCharResponse
          #   m_return - SOAP::SOAPInt
          class SetPasswordCharResponse            def m_return
              @v_return
            end

            def m_return=(value)  @v_return = value
            end

            def initialize(v_return = nil)  @v_return = v_return
            end
          end
          # {http:controls.classes.win32.server.sirius.org/}ScrollCaret
          #   arg0 - SOAP::SOAPLong
          class ScrollCaret
            attr_accessor :arg0
            def initialize(arg0 = nil)  @arg0 = arg0
            end
          end
          # {http:controls.classes.win32.server.sirius.org/}ScrollCaretResponse
          #   m_return - SOAP::SOAPBoolean
          class ScrollCaretResponse            def m_return
              @v_return
            end

            def m_return=(value)  @v_return = value
            end

            def initialize(v_return = nil)  @v_return = v_return
            end
          end
          # {http:controls.classes.win32.server.sirius.org/}SetSel
          #   arg0 - SOAP::SOAPLong
          #   arg1 - SOAP::SOAPInt
          #   arg2 - SOAP::SOAPInt
          class SetSel
            attr_accessor :arg0
            attr_accessor :arg1
            attr_accessor :arg2
            def initialize(arg0 = nil, arg1 = nil, arg2 = nil)  @arg0 = arg0
              @arg1 = arg1
              @arg2 = arg2
            end
          end
          # {http:controls.classes.win32.server.sirius.org/}SetSelResponse
          #   m_return - SOAP::SOAPInt
          class SetSelResponse            def m_return
              @v_return
            end

            def m_return=(value)  @v_return = value
            end

            def initialize(v_return = nil)  @v_return = v_return
            end
          end
          # {http:controls.classes.win32.server.sirius.org/}CanUndo
          #   arg0 - SOAP::SOAPLong
          class CanUndo
            attr_accessor :arg0
            def initialize(arg0 = nil)  @arg0 = arg0
            end
          end
          # {http:controls.classes.win32.server.sirius.org/}CanUndoResponse
          #   m_return - SOAP::SOAPInt
          class CanUndoResponse            def m_return
              @v_return
            end

            def m_return=(value)  @v_return = value
            end

            def initialize(v_return = nil)  @v_return = v_return
            end
          end
          # {http:controls.classes.win32.server.sirius.org/}GetPasswordChar
          #   arg0 - SOAP::SOAPLong
          class GetPasswordChar
            attr_accessor :arg0
            def initialize(arg0 = nil)  @arg0 = arg0
            end
          end
          # {http:controls.classes.win32.server.sirius.org/}GetPasswordCharResponse
          #   m_return - SOAP::SOAPInt
          class GetPasswordCharResponse            def m_return
              @v_return
            end

            def m_return=(value)  @v_return = value
            end

            def initialize(v_return = nil)  @v_return = v_return
            end
          end
          # {http:controls.classes.win32.server.sirius.org/}GetSel
          #   arg0 - SOAP::SOAPLong
          class GetSel
            attr_accessor :arg0
            def initialize(arg0 = nil)  @arg0 = arg0
            end
          end
          # {http:controls.classes.win32.server.sirius.org/}GetSelResponse
          #   m_return - SOAP::SOAPInt
          class GetSelResponse            def m_return
              @v_return
            end

            def m_return=(value)  @v_return = value
            end

            def initialize(v_return = nil)  @v_return = v_return
            end
          end
          # {http:controls.classes.win32.server.sirius.org/}GetLineCount
          #   arg0 - SOAP::SOAPLong
          class GetLineCount
            attr_accessor :arg0
            def initialize(arg0 = nil)  @arg0 = arg0
            end
          end
          # {http:controls.classes.win32.server.sirius.org/}GetLineCountResponse
          #   m_return - SOAP::SOAPInt
          class GetLineCountResponse            def m_return
              @v_return
            end

            def m_return=(value)  @v_return = value
            end

            def initialize(v_return = nil)  @v_return = v_return
            end
          end
          # {http:controls.classes.win32.server.sirius.org/}GetModify
          #   arg0 - SOAP::SOAPLong
          class GetModify
            attr_accessor :arg0
            def initialize(arg0 = nil)  @arg0 = arg0
            end
          end
          # {http:controls.classes.win32.server.sirius.org/}GetModifyResponse
          #   m_return - SOAP::SOAPInt
          class GetModifyResponse            def m_return
              @v_return
            end

            def m_return=(value)  @v_return = value
            end

            def initialize(v_return = nil)  @v_return = v_return
            end
          end
          # {http:controls.classes.win32.server.sirius.org/}Scroll
          #   arg0 - SOAP::SOAPLong
          #   arg1 - SOAP::SOAPInt
          #   arg2 - SOAP::SOAPInt
          class Scroll
            attr_accessor :arg0
            attr_accessor :arg1
            attr_accessor :arg2
            def initialize(arg0 = nil, arg1 = nil, arg2 = nil)  @arg0 = arg0
              @arg1 = arg1
              @arg2 = arg2
            end
          end
          # {http:controls.classes.win32.server.sirius.org/}ScrollResponse
          #   m_return - SOAP::SOAPInt
          class ScrollResponse            def m_return
              @v_return
            end

            def m_return=(value)  @v_return = value
            end

            def initialize(v_return = nil)  @v_return = v_return
            end
          end

        end; end; end; end; end
