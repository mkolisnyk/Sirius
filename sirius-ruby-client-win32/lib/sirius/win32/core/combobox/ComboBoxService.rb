require 'xsd/qname'

module Sirius; module Client; module Win32; module Core; module Combobox

          # {http:controls.classes.win32.server.sirius.org/}SetEditSel
          #   arg0 - SOAP::SOAPLong
          #   arg1 - SOAP::SOAPInt
          #   arg2 - SOAP::SOAPInt          class SetEditSel
            attr_accessor :arg0
            attr_accessor :arg1
            attr_accessor :arg2
            def initialize(arg0 = nil, arg1 = nil, arg2 = nil)  @arg0 = arg0
              @arg1 = arg1
              @arg2 = arg2
            end
          end
          # {http:controls.classes.win32.server.sirius.org/}SetEditSelResponse
          #   m_return - SOAP::SOAPInt
          class SetEditSelResponse            def m_return
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
          class FindStringExactResponse            def m_return
              @v_return
            end

            def m_return=(value)  @v_return = value
            end

            def initialize(v_return = nil)  @v_return = v_return
            end
          end
          # {http:controls.classes.win32.server.sirius.org/}GetExtendedUI
          #   arg0 - SOAP::SOAPLong
          class GetExtendedUI
            attr_accessor :arg0
            def initialize(arg0 = nil)  @arg0 = arg0
            end
          end
          # {http:controls.classes.win32.server.sirius.org/}GetExtendedUIResponse
          #   m_return - SOAP::SOAPInt
          class GetExtendedUIResponse            def m_return
              @v_return
            end

            def m_return=(value)  @v_return = value
            end

            def initialize(v_return = nil)  @v_return = v_return
            end
          end
          # {http:controls.classes.win32.server.sirius.org/}ResetContent
          #   arg0 - SOAP::SOAPLong
          class ResetContent
            attr_accessor :arg0
            def initialize(arg0 = nil)  @arg0 = arg0
            end
          end
          # {http:controls.classes.win32.server.sirius.org/}ResetContentResponse
          #   m_return - SOAP::SOAPInt
          class ResetContentResponse            def m_return
              @v_return
            end

            def m_return=(value)  @v_return = value
            end

            def initialize(v_return = nil)  @v_return = v_return
            end
          end
          # {http:controls.classes.win32.server.sirius.org/}GetTextLength
          #   arg0 - SOAP::SOAPLong
          class GetTextLength
            attr_accessor :arg0
            def initialize(arg0 = nil)  @arg0 = arg0
            end
          end
          # {http:controls.classes.win32.server.sirius.org/}GetTextLengthResponse
          #   m_return - SOAP::SOAPInt
          class GetTextLengthResponse            def m_return
              @v_return
            end

            def m_return=(value)  @v_return = value
            end

            def initialize(v_return = nil)  @v_return = v_return
            end
          end
          # {http:controls.classes.win32.server.sirius.org/}GetDroppedState
          #   arg0 - SOAP::SOAPLong
          class GetDroppedState
            attr_accessor :arg0
            def initialize(arg0 = nil)  @arg0 = arg0
            end
          end
          # {http:controls.classes.win32.server.sirius.org/}GetDroppedStateResponse
          #   m_return - SOAP::SOAPInt
          class GetDroppedStateResponse            def m_return
              @v_return
            end

            def m_return=(value)  @v_return = value
            end

            def initialize(v_return = nil)  @v_return = v_return
            end
          end
          # {http:controls.classes.win32.server.sirius.org/}SetItemHeight
          #   arg0 - SOAP::SOAPLong
          #   arg1 - SOAP::SOAPInt
          #   arg2 - SOAP::SOAPInt
          class SetItemHeight
            attr_accessor :arg0
            attr_accessor :arg1
            attr_accessor :arg2
            def initialize(arg0 = nil, arg1 = nil, arg2 = nil)  @arg0 = arg0
              @arg1 = arg1
              @arg2 = arg2
            end
          end
          # {http:controls.classes.win32.server.sirius.org/}SetItemHeightResponse
          #   m_return - SOAP::SOAPInt
          class SetItemHeightResponse            def m_return
              @v_return
            end

            def m_return=(value)  @v_return = value
            end

            def initialize(v_return = nil)  @v_return = v_return
            end
          end
          # {http:controls.classes.win32.server.sirius.org/}GetCount
          #   arg0 - SOAP::SOAPLong
          class GetCount
            attr_accessor :arg0
            def initialize(arg0 = nil)  @arg0 = arg0
            end
          end
          # {http:controls.classes.win32.server.sirius.org/}GetCountResponse
          #   m_return - SOAP::SOAPInt
          class GetCountResponse            def m_return
              @v_return
            end

            def m_return=(value)  @v_return = value
            end

            def initialize(v_return = nil)  @v_return = v_return
            end
          end
          # {http:controls.classes.win32.server.sirius.org/}FindItemData
          #   arg0 - SOAP::SOAPLong
          #   arg1 - SOAP::SOAPInt
          #   arg2 - Sirius::Client::Win32::Core::Combobox::Lparam
          class FindItemData
            attr_accessor :arg0
            attr_accessor :arg1
            attr_accessor :arg2
            def initialize(arg0 = nil, arg1 = nil, arg2 = nil)  @arg0 = arg0
              @arg1 = arg1
              @arg2 = arg2
            end
          end
          # {http:controls.classes.win32.server.sirius.org/}number
          # abstract
          class Number            def initialize
            end
          end
          # {http:controls.classes.win32.server.sirius.org/}integerType
          # abstract
          class IntegerType < Number            def initialize
            end
          end
          # {http:controls.classes.win32.server.sirius.org/}longPTR
          class LongPTR < IntegerType            def initialize
            end
          end
          # {http:controls.classes.win32.server.sirius.org/}lparam
          class Lparam < LongPTR            def initialize
            end
          end
          # {http:controls.classes.win32.server.sirius.org/}FindItemDataResponse
          #   m_return - SOAP::SOAPInt
          class FindItemDataResponse            def m_return
              @v_return
            end

            def m_return=(value)  @v_return = value
            end

            def initialize(v_return = nil)  @v_return = v_return
            end
          end
          # {http:controls.classes.win32.server.sirius.org/}GetEditSel
          #   arg0 - SOAP::SOAPLong
          class GetEditSel
            attr_accessor :arg0
            def initialize(arg0 = nil)  @arg0 = arg0
            end
          end
          # {http:controls.classes.win32.server.sirius.org/}GetEditSelResponse
          #   m_return - SOAP::SOAPInt
          class GetEditSelResponse            def m_return
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
          class SelectStringResponse            def m_return
              @v_return
            end

            def m_return=(value)  @v_return = value
            end

            def initialize(v_return = nil)  @v_return = v_return
            end
          end
          # {http:controls.classes.win32.server.sirius.org/}GetItemHeight
          #   arg0 - SOAP::SOAPLong
          class GetItemHeight
            attr_accessor :arg0
            def initialize(arg0 = nil)  @arg0 = arg0
            end
          end
          # {http:controls.classes.win32.server.sirius.org/}GetItemHeightResponse
          #   m_return - SOAP::SOAPInt
          class GetItemHeightResponse            def m_return
              @v_return
            end

            def m_return=(value)  @v_return = value
            end

            def initialize(v_return = nil)  @v_return = v_return
            end
          end
          # {http:controls.classes.win32.server.sirius.org/}GetText
          #   arg0 - SOAP::SOAPLong
          class GetText
            attr_accessor :arg0
            def initialize(arg0 = nil)  @arg0 = arg0
            end
          end
          # {http:controls.classes.win32.server.sirius.org/}GetTextResponse
          #   m_return - SOAP::SOAPString
          class GetTextResponse            def m_return
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
          class FindStringResponse            def m_return
              @v_return
            end

            def m_return=(value)  @v_return = value
            end

            def initialize(v_return = nil)  @v_return = v_return
            end
          end
          # {http:controls.classes.win32.server.sirius.org/}ShowDropdown
          #   arg0 - SOAP::SOAPLong
          #   arg1 - SOAP::SOAPBoolean
          class ShowDropdown
            attr_accessor :arg0
            attr_accessor :arg1
            def initialize(arg0 = nil, arg1 = nil)  @arg0 = arg0
              @arg1 = arg1
            end
          end
          # {http:controls.classes.win32.server.sirius.org/}ShowDropdownResponse
          #   m_return - SOAP::SOAPInt
          class ShowDropdownResponse            def m_return
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
          class SetTextResponse            def initialize
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
          class GetCurSelResponse            def m_return
              @v_return
            end

            def m_return=(value)  @v_return = value
            end

            def initialize(v_return = nil)  @v_return = v_return
            end
          end
          # {http:controls.classes.win32.server.sirius.org/}GetItemData
          #   arg0 - SOAP::SOAPLong
          #   arg1 - SOAP::SOAPInt
          class GetItemData
            attr_accessor :arg0
            attr_accessor :arg1
            def initialize(arg0 = nil, arg1 = nil)  @arg0 = arg0
              @arg1 = arg1
            end
          end
          # {http:controls.classes.win32.server.sirius.org/}GetItemDataResponse
          #   m_return - SOAP::SOAPInt
          class GetItemDataResponse            def m_return
              @v_return
            end

            def m_return=(value)  @v_return = value
            end

            def initialize(v_return = nil)  @v_return = v_return
            end
          end
          # {http:controls.classes.win32.server.sirius.org/}GetLBText
          #   arg0 - SOAP::SOAPLong
          #   arg1 - SOAP::SOAPInt
          #   arg2 - SOAP::SOAPString
          class GetLBText
            attr_accessor :arg0
            attr_accessor :arg1
            attr_accessor :arg2
            def initialize(arg0 = nil, arg1 = nil, arg2 = nil)  @arg0 = arg0
              @arg1 = arg1
              @arg2 = arg2
            end
          end
          # {http:controls.classes.win32.server.sirius.org/}GetLBTextResponse
          #   m_return - SOAP::SOAPInt
          class GetLBTextResponse            def m_return
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
          class SetCurSelResponse            def m_return
              @v_return
            end

            def m_return=(value)  @v_return = value
            end

            def initialize(v_return = nil)  @v_return = v_return
            end
          end
          # {http:controls.classes.win32.server.sirius.org/}GetLBTextLen
          #   arg0 - SOAP::SOAPLong
          #   arg1 - SOAP::SOAPInt
          class GetLBTextLen
            attr_accessor :arg0
            attr_accessor :arg1
            def initialize(arg0 = nil, arg1 = nil)  @arg0 = arg0
              @arg1 = arg1
            end
          end
          # {http:controls.classes.win32.server.sirius.org/}GetLBTextLenResponse
          #   m_return - SOAP::SOAPInt
          class GetLBTextLenResponse            def m_return
              @v_return
            end

            def m_return=(value)  @v_return = value
            end

            def initialize(v_return = nil)  @v_return = v_return
            end
          end

        end; end; end; end; end
