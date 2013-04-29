require 'xsd/qname'

module Sirius; module Client; module Win32; module Core; module Listbox

          # {http:controls.classes.win32.server.sirius.org/}GetCount
          #   arg0 - SOAP::SOAPLong
          class GetCount

            attr_accessor :arg0
            def initialize(arg0 = nil)  @arg0 = arg0

            end

          end
          # {http:controls.classes.win32.server.sirius.org/}GetCountResponse
          #   m_return - SOAP::SOAPInt

          class GetCountResponse
            def m_return
              @v_return

            end

            def m_return=(value)  @v_return = value

            end

            def initialize(v_return = nil)  @v_return = v_return

            end

          end
          # {http:controls.classes.win32.server.sirius.org/}FindString
          #   arg0 - SOAP::SOAPLong
          #   arg1 - SOAP::SOAPInt
          #   arg2 - SOAP::SOAPString

          class FindString

            attr_accessor :arg0

            attr_accessor :arg1

            attr_accessor :arg2
            def initialize(arg0 = nil, arg1 = nil, arg2 = nil)  @arg0 = arg0
              @arg1 = arg1
              @arg2 = arg2

            end

          end
          # {http:controls.classes.win32.server.sirius.org/}FindStringResponse
          #   m_return - SOAP::SOAPInt

          class FindStringResponse
            def m_return
              @v_return

            end

            def m_return=(value)  @v_return = value

            end

            def initialize(v_return = nil)  @v_return = v_return

            end

          end
          # {http:controls.classes.win32.server.sirius.org/}SelItemRange
          #   arg0 - SOAP::SOAPLong
          #   arg1 - SOAP::SOAPBoolean
          #   arg2 - SOAP::SOAPInt
          #   arg3 - SOAP::SOAPInt

          class SelItemRange

            attr_accessor :arg0

            attr_accessor :arg1

            attr_accessor :arg2

            attr_accessor :arg3
            def initialize(arg0 = nil, arg1 = nil, arg2 = nil, arg3 = nil)  @arg0 = arg0
              @arg1 = arg1
              @arg2 = arg2
              @arg3 = arg3

            end

          end
          # {http:controls.classes.win32.server.sirius.org/}SelItemRangeResponse
          #   m_return - SOAP::SOAPInt

          class SelItemRangeResponse
            def m_return
              @v_return

            end

            def m_return=(value)  @v_return = value

            end

            def initialize(v_return = nil)  @v_return = v_return

            end

          end
          # {http:controls.classes.win32.server.sirius.org/}GetText
          #   arg0 - SOAP::SOAPLong
          #   arg1 - SOAP::SOAPInt

          class GetText

            attr_accessor :arg0

            attr_accessor :arg1
            def initialize(arg0 = nil, arg1 = nil)  @arg0 = arg0
              @arg1 = arg1

            end

          end
          # {http:controls.classes.win32.server.sirius.org/}GetTextResponse
          #   m_return - SOAP::SOAPString

          class GetTextResponse
            def m_return
              @v_return

            end

            def m_return=(value)  @v_return = value

            end

            def initialize(v_return = nil)  @v_return = v_return

            end

          end
          # {http:controls.classes.win32.server.sirius.org/}GetItemHeight
          #   arg0 - SOAP::SOAPLong
          #   arg1 - SOAP::SOAPInt

          class GetItemHeight

            attr_accessor :arg0

            attr_accessor :arg1
            def initialize(arg0 = nil, arg1 = nil)  @arg0 = arg0
              @arg1 = arg1

            end

          end
          # {http:controls.classes.win32.server.sirius.org/}GetItemHeightResponse
          #   m_return - SOAP::SOAPInt

          class GetItemHeightResponse
            def m_return
              @v_return

            end

            def m_return=(value)  @v_return = value

            end

            def initialize(v_return = nil)  @v_return = v_return

            end

          end
          # {http:controls.classes.win32.server.sirius.org/}SetCaretIndex
          #   arg0 - SOAP::SOAPLong
          #   arg1 - SOAP::SOAPInt

          class SetCaretIndex

            attr_accessor :arg0

            attr_accessor :arg1
            def initialize(arg0 = nil, arg1 = nil)  @arg0 = arg0
              @arg1 = arg1

            end

          end
          # {http:controls.classes.win32.server.sirius.org/}SetCaretIndexResponse
          #   m_return - SOAP::SOAPInt

          class SetCaretIndexResponse
            def m_return
              @v_return

            end

            def m_return=(value)  @v_return = value

            end

            def initialize(v_return = nil)  @v_return = v_return

            end

          end
          # {http:controls.classes.win32.server.sirius.org/}SelectString
          #   arg0 - SOAP::SOAPLong
          #   arg1 - SOAP::SOAPInt
          #   arg2 - SOAP::SOAPString

          class SelectString

            attr_accessor :arg0

            attr_accessor :arg1

            attr_accessor :arg2
            def initialize(arg0 = nil, arg1 = nil, arg2 = nil)  @arg0 = arg0
              @arg1 = arg1
              @arg2 = arg2

            end

          end
          # {http:controls.classes.win32.server.sirius.org/}SelectStringResponse
          #   m_return - SOAP::SOAPInt

          class SelectStringResponse
            def m_return
              @v_return

            end

            def m_return=(value)  @v_return = value

            end

            def initialize(v_return = nil)  @v_return = v_return

            end

          end
          # {http:controls.classes.win32.server.sirius.org/}SetCurSel
          #   arg0 - SOAP::SOAPLong
          #   arg1 - SOAP::SOAPInt

          class SetCurSel

            attr_accessor :arg0

            attr_accessor :arg1
            def initialize(arg0 = nil, arg1 = nil)  @arg0 = arg0
              @arg1 = arg1

            end

          end
          # {http:controls.classes.win32.server.sirius.org/}SetCurSelResponse
          #   m_return - SOAP::SOAPInt

          class SetCurSelResponse
            def m_return
              @v_return

            end

            def m_return=(value)  @v_return = value

            end

            def initialize(v_return = nil)  @v_return = v_return

            end

          end
          # {http:controls.classes.win32.server.sirius.org/}GetCurSel
          #   arg0 - SOAP::SOAPLong

          class GetCurSel

            attr_accessor :arg0
            def initialize(arg0 = nil)  @arg0 = arg0

            end

          end
          # {http:controls.classes.win32.server.sirius.org/}GetCurSelResponse
          #   m_return - SOAP::SOAPInt

          class GetCurSelResponse
            def m_return
              @v_return

            end

            def m_return=(value)  @v_return = value

            end

            def initialize(v_return = nil)  @v_return = v_return

            end

          end
          # {http:controls.classes.win32.server.sirius.org/}SetSel
          #   arg0 - SOAP::SOAPLong
          #   arg1 - SOAP::SOAPBoolean
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

          class SetSelResponse
            def m_return
              @v_return

            end

            def m_return=(value)  @v_return = value

            end

            def initialize(v_return = nil)  @v_return = v_return

            end

          end
          # {http:controls.classes.win32.server.sirius.org/}GetSelCount
          #   arg0 - SOAP::SOAPLong

          class GetSelCount

            attr_accessor :arg0
            def initialize(arg0 = nil)  @arg0 = arg0

            end

          end
          # {http:controls.classes.win32.server.sirius.org/}GetSelCountResponse
          #   m_return - SOAP::SOAPInt

          class GetSelCountResponse
            def m_return
              @v_return

            end

            def m_return=(value)  @v_return = value

            end

            def initialize(v_return = nil)  @v_return = v_return

            end

          end
          # {http:controls.classes.win32.server.sirius.org/}FindStringExact
          #   arg0 - SOAP::SOAPLong
          #   arg1 - SOAP::SOAPInt
          #   arg2 - SOAP::SOAPString

          class FindStringExact

            attr_accessor :arg0

            attr_accessor :arg1

            attr_accessor :arg2
            def initialize(arg0 = nil, arg1 = nil, arg2 = nil)  @arg0 = arg0
              @arg1 = arg1
              @arg2 = arg2

            end

          end
          # {http:controls.classes.win32.server.sirius.org/}FindStringExactResponse
          #   m_return - SOAP::SOAPInt

          class FindStringExactResponse
            def m_return
              @v_return

            end

            def m_return=(value)  @v_return = value

            end

            def initialize(v_return = nil)  @v_return = v_return

            end

          end
          # {http:controls.classes.win32.server.sirius.org/}GetCaretIndex
          #   arg0 - SOAP::SOAPLong

          class GetCaretIndex

            attr_accessor :arg0
            def initialize(arg0 = nil)  @arg0 = arg0

            end

          end
          # {http:controls.classes.win32.server.sirius.org/}GetCaretIndexResponse
          #   m_return - SOAP::SOAPInt

          class GetCaretIndexResponse
            def m_return
              @v_return

            end

            def m_return=(value)  @v_return = value

            end

            def initialize(v_return = nil)  @v_return = v_return

            end

          end
          # {http:controls.classes.win32.server.sirius.org/}GetTextLen
          #   arg0 - SOAP::SOAPLong
          #   arg1 - SOAP::SOAPInt

          class GetTextLen

            attr_accessor :arg0

            attr_accessor :arg1
            def initialize(arg0 = nil, arg1 = nil)  @arg0 = arg0
              @arg1 = arg1

            end

          end
          # {http:controls.classes.win32.server.sirius.org/}GetTextLenResponse
          #   m_return - SOAP::SOAPInt

          class GetTextLenResponse
            def m_return
              @v_return

            end

            def m_return=(value)  @v_return = value

            end

            def initialize(v_return = nil)  @v_return = v_return

            end

          end
          # {http:controls.classes.win32.server.sirius.org/}GetTopIndex
          #   arg0 - SOAP::SOAPLong

          class GetTopIndex

            attr_accessor :arg0
            def initialize(arg0 = nil)  @arg0 = arg0

            end

          end
          # {http:controls.classes.win32.server.sirius.org/}GetTopIndexResponse
          #   m_return - SOAP::SOAPInt

          class GetTopIndexResponse
            def m_return
              @v_return

            end

            def m_return=(value)  @v_return = value

            end

            def initialize(v_return = nil)  @v_return = v_return

            end

          end
          # {http:controls.classes.win32.server.sirius.org/}GetHorizontalExtent
          #   arg0 - SOAP::SOAPLong

          class GetHorizontalExtent

            attr_accessor :arg0
            def initialize(arg0 = nil)  @arg0 = arg0

            end

          end
          # {http:controls.classes.win32.server.sirius.org/}GetHorizontalExtentResponse
          #   m_return - SOAP::SOAPInt

          class GetHorizontalExtentResponse
            def m_return
              @v_return

            end

            def m_return=(value)  @v_return = value

            end

            def initialize(v_return = nil)  @v_return = v_return

            end

          end
          # {http:controls.classes.win32.server.sirius.org/}GetSel
          #   arg0 - SOAP::SOAPLong
          #   arg1 - SOAP::SOAPInt

          class GetSel

            attr_accessor :arg0

            attr_accessor :arg1
            def initialize(arg0 = nil, arg1 = nil)  @arg0 = arg0
              @arg1 = arg1

            end

          end
          # {http:controls.classes.win32.server.sirius.org/}GetSelResponse
          #   m_return - SOAP::SOAPInt

          class GetSelResponse
            def m_return
              @v_return

            end

            def m_return=(value)  @v_return = value

            end

            def initialize(v_return = nil)  @v_return = v_return

            end

          end

        end; end; end; end; end
