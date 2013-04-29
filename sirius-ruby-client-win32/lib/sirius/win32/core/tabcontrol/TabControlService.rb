require 'xsd/qname'

module Sirius; module Client; module Win32; module Core; module Tabcontrol

          # {http:controls.classes.win32.server.sirius.org/}GetCurFocus
          #   arg0 - SOAP::SOAPLong
          class GetCurFocus

            attr_accessor :arg0
            def initialize(arg0 = nil)  @arg0 = arg0

            end

          end
          # {http:controls.classes.win32.server.sirius.org/}GetCurFocusResponse
          #   m_return - SOAP::SOAPInt

          class GetCurFocusResponse
            def m_return
              @v_return

            end

            def m_return=(value)  @v_return = value

            end

            def initialize(v_return = nil)  @v_return = v_return

            end

          end
          # {http:controls.classes.win32.server.sirius.org/}GetRowCount
          #   arg0 - SOAP::SOAPLong

          class GetRowCount

            attr_accessor :arg0
            def initialize(arg0 = nil)  @arg0 = arg0

            end

          end
          # {http:controls.classes.win32.server.sirius.org/}GetRowCountResponse
          #   m_return - SOAP::SOAPInt

          class GetRowCountResponse
            def m_return
              @v_return

            end

            def m_return=(value)  @v_return = value

            end

            def initialize(v_return = nil)  @v_return = v_return

            end

          end
          # {http:controls.classes.win32.server.sirius.org/}HitTest
          #   arg0 - SOAP::SOAPLong

          class HitTest

            attr_accessor :arg0
            def initialize(arg0 = nil)  @arg0 = arg0

            end

          end
          # {http:controls.classes.win32.server.sirius.org/}HitTestResponse
          #   m_return - Sirius::Client::Win32::Core::Tabcontrol::TcHITTESTINFO

          class HitTestResponse
            def m_return
              @v_return

            end

            def m_return=(value)  @v_return = value

            end

            def initialize(v_return = nil)  @v_return = v_return

            end

          end
          # {http:controls.classes.win32.server.sirius.org/}structure
          # abstract
          #   autoRead - SOAP::SOAPBoolean
          #   autoWrite - SOAP::SOAPBoolean

          class Structure

            attr_accessor :autoRead

            attr_accessor :autoWrite
            def initialize(autoRead = nil, autoWrite = nil)  @autoRead = autoRead
              @autoWrite = autoWrite

            end

          end
          # {http:controls.classes.win32.server.sirius.org/}tcHITTESTINFO
          #   autoRead - SOAP::SOAPBoolean
          #   autoWrite - SOAP::SOAPBoolean
          #   pt - Sirius::Client::Win32::Core::Tabcontrol::Point
          #   flags - SOAP::SOAPInt

          class TcHITTESTINFO < Structure

            attr_accessor :autoRead

            attr_accessor :autoWrite

            attr_accessor :pt

            attr_accessor :flags
            def initialize(autoRead = nil, autoWrite = nil, pt = nil, flags = nil)  @autoRead = autoRead
              @autoWrite = autoWrite
              @pt = pt
              @flags = flags

            end

          end
          # {http:controls.classes.win32.server.sirius.org/}point
          #   autoRead - SOAP::SOAPBoolean
          #   autoWrite - SOAP::SOAPBoolean
          #   x - SOAP::SOAPInt
          #   y - SOAP::SOAPInt

          class Point < Structure

            attr_accessor :autoRead

            attr_accessor :autoWrite

            attr_accessor :x

            attr_accessor :y
            def initialize(autoRead = nil, autoWrite = nil, x = nil, y = nil)  @autoRead = autoRead
              @autoWrite = autoWrite
              @x = x
              @y = y

            end

          end
          # {http:controls.classes.win32.server.sirius.org/}rect
          #   autoRead - SOAP::SOAPBoolean
          #   autoWrite - SOAP::SOAPBoolean
          #   left - SOAP::SOAPInt
          #   top - SOAP::SOAPInt
          #   right - SOAP::SOAPInt
          #   bottom - SOAP::SOAPInt

          class Rect < Structure

            attr_accessor :autoRead

            attr_accessor :autoWrite

            attr_accessor :left

            attr_accessor :top

            attr_accessor :right

            attr_accessor :bottom
            def initialize(autoRead = nil, autoWrite = nil, left = nil, top = nil, right = nil, bottom = nil)  @autoRead = autoRead
              @autoWrite = autoWrite
              @left = left
              @top = top
              @right = right
              @bottom = bottom

            end

          end
          # {http:controls.classes.win32.server.sirius.org/}tcITEM
          #   autoRead - SOAP::SOAPBoolean
          #   autoWrite - SOAP::SOAPBoolean
          #   mask - SOAP::SOAPInt
          #   dwState - SOAP::SOAPInt
          #   dwStateMask - SOAP::SOAPInt
          #   pszText - SOAP::SOAPString
          #   cchTextMax - SOAP::SOAPInt
          #   iImage - SOAP::SOAPInt
          #   lParam - Sirius::Client::Win32::Core::Tabcontrol::Lparam

          class TcITEM < Structure

            attr_accessor :autoRead

            attr_accessor :autoWrite

            attr_accessor :mask

            attr_accessor :dwState

            attr_accessor :dwStateMask

            attr_accessor :pszText

            attr_accessor :cchTextMax

            attr_accessor :iImage

            attr_accessor :lParam
            def initialize(autoRead = nil, autoWrite = nil, mask = nil, dwState = nil, dwStateMask = nil, pszText = nil, cchTextMax = nil, iImage = nil, lParam = nil)  @autoRead = autoRead
              @autoWrite = autoWrite
              @mask = mask
              @dwState = dwState
              @dwStateMask = dwStateMask
              @pszText = pszText
              @cchTextMax = cchTextMax
              @iImage = iImage
              @lParam = lParam

            end

          end
          # {http:controls.classes.win32.server.sirius.org/}GetItemCount
          #   arg0 - SOAP::SOAPLong

          class GetItemCount

            attr_accessor :arg0
            def initialize(arg0 = nil)  @arg0 = arg0

            end

          end
          # {http:controls.classes.win32.server.sirius.org/}GetItemCountResponse
          #   m_return - SOAP::SOAPInt

          class GetItemCountResponse
            def m_return
              @v_return

            end

            def m_return=(value)  @v_return = value

            end

            def initialize(v_return = nil)  @v_return = v_return

            end

          end
          # {http:controls.classes.win32.server.sirius.org/}GetItemRect
          #   arg0 - SOAP::SOAPLong
          #   arg1 - SOAP::SOAPInt

          class GetItemRect

            attr_accessor :arg0

            attr_accessor :arg1
            def initialize(arg0 = nil, arg1 = nil)  @arg0 = arg0
              @arg1 = arg1

            end

          end
          # {http:controls.classes.win32.server.sirius.org/}GetItemRectResponse
          #   m_return - Sirius::Client::Win32::Core::Tabcontrol::Rect

          class GetItemRectResponse
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
          # {http:controls.classes.win32.server.sirius.org/}SetCurFocus
          #   arg0 - SOAP::SOAPLong
          #   arg1 - SOAP::SOAPInt

          class SetCurFocus

            attr_accessor :arg0

            attr_accessor :arg1
            def initialize(arg0 = nil, arg1 = nil)  @arg0 = arg0
              @arg1 = arg1

            end

          end
          # {http:controls.classes.win32.server.sirius.org/}SetCurFocusResponse

          class SetCurFocusResponse
            def initialize

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

          class SetCurSelResponse
            def initialize

            end

          end
          # {http:controls.classes.win32.server.sirius.org/}GetItem
          #   arg0 - SOAP::SOAPLong
          #   arg1 - SOAP::SOAPInt

          class GetItem

            attr_accessor :arg0

            attr_accessor :arg1
            def initialize(arg0 = nil, arg1 = nil)  @arg0 = arg0
              @arg1 = arg1

            end

          end
          # {http:controls.classes.win32.server.sirius.org/}GetItemResponse
          #   m_return - Sirius::Client::Win32::Core::Tabcontrol::TcITEM

          class GetItemResponse
            def m_return
              @v_return

            end

            def m_return=(value)  @v_return = value

            end

            def initialize(v_return = nil)  @v_return = v_return

            end

          end
          # {http:controls.classes.win32.server.sirius.org/}number
          # abstract

          class Number
            def initialize

            end

          end
          # {http:controls.classes.win32.server.sirius.org/}integerType
          # abstract

          class IntegerType < Number
            def initialize

            end

          end
          # {http:controls.classes.win32.server.sirius.org/}longPTR

          class LongPTR < IntegerType
            def initialize

            end

          end
          # {http:controls.classes.win32.server.sirius.org/}lparam

          class Lparam < LongPTR
            def initialize

            end

          end

        end; end; end; end; end
