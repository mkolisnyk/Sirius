require 'xsd/qname'

module Sirius; module Client; module Win32; module Core; module Window

          # {http://classes.win32.server.sirius.org/}keyUp
          #   arg0 - SOAP::SOAPLong
          #   arg1 - SOAP::SOAPInt
          class KeyUp

            attr_accessor :arg0

            attr_accessor :arg1
            def initialize(arg0 = nil, arg1 = nil)  @arg0 = arg0
              @arg1 = arg1

            end

          end
          # {http://classes.win32.server.sirius.org/}keyUpResponse

          class KeyUpResponse
            def initialize

            end

          end
          # {http://classes.win32.server.sirius.org/}getSystemMenu
          #   arg0 - SOAP::SOAPLong
          #   arg1 - SOAP::SOAPBoolean

          class GetSystemMenu

            attr_accessor :arg0

            attr_accessor :arg1
            def initialize(arg0 = nil, arg1 = nil)  @arg0 = arg0
              @arg1 = arg1

            end

          end
          # {http://classes.win32.server.sirius.org/}getSystemMenuResponse
          #   m_return - SOAP::SOAPLong

          class GetSystemMenuResponse
            def m_return
              @v_return

            end

            def m_return=(value)  @v_return = value

            end

            def initialize(v_return = nil)  @v_return = v_return

            end

          end
          # {http://classes.win32.server.sirius.org/}move
          #   arg0 - SOAP::SOAPLong
          #   arg1 - SOAP::SOAPInt
          #   arg2 - SOAP::SOAPInt
          #   arg3 - SOAP::SOAPInt
          #   arg4 - SOAP::SOAPInt

          class Move

            attr_accessor :arg0

            attr_accessor :arg1

            attr_accessor :arg2

            attr_accessor :arg3

            attr_accessor :arg4
            def initialize(arg0 = nil, arg1 = nil, arg2 = nil, arg3 = nil, arg4 = nil)  @arg0 = arg0
              @arg1 = arg1
              @arg2 = arg2
              @arg3 = arg3
              @arg4 = arg4

            end

          end
          # {http://classes.win32.server.sirius.org/}moveResponse

          class MoveResponse
            def initialize

            end

          end
          # {http://classes.win32.server.sirius.org/}getRect
          #   arg0 - SOAP::SOAPLong

          class GetRect

            attr_accessor :arg0
            def initialize(arg0 = nil)  @arg0 = arg0

            end

          end
          # {http://classes.win32.server.sirius.org/}getRectResponse
          #   m_return - Sirius::Client::Win32::Core::Window::Rect

          class GetRectResponse
            def m_return
              @v_return

            end

            def m_return=(value)  @v_return = value

            end

            def initialize(v_return = nil)  @v_return = v_return

            end

          end
          # {http://classes.win32.server.sirius.org/}structure
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
          # {http://classes.win32.server.sirius.org/}rect
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
          # {http://classes.win32.server.sirius.org/}windowplacement
          #   autoRead - SOAP::SOAPBoolean
          #   autoWrite - SOAP::SOAPBoolean
          #   length - SOAP::SOAPInt
          #   flags - SOAP::SOAPInt
          #   showCmd - SOAP::SOAPInt
          #   ptMinPosition - Sirius::Client::Win32::Core::Window::Point
          #   ptMaxPosition - Sirius::Client::Win32::Core::Window::Point
          #   rcNormalPosition - Sirius::Client::Win32::Core::Window::Rect

          class Windowplacement < Structure

            attr_accessor :autoRead

            attr_accessor :autoWrite

            attr_accessor :length

            attr_accessor :flags

            attr_accessor :showCmd

            attr_accessor :ptMinPosition

            attr_accessor :ptMaxPosition

            attr_accessor :rcNormalPosition
            def initialize(autoRead = nil, autoWrite = nil, length = nil, flags = nil, showCmd = nil, ptMinPosition = nil, ptMaxPosition = nil, rcNormalPosition = nil)  @autoRead = autoRead
              @autoWrite = autoWrite
              @length = length
              @flags = flags
              @showCmd = showCmd
              @ptMinPosition = ptMinPosition
              @ptMaxPosition = ptMaxPosition
              @rcNormalPosition = rcNormalPosition

            end

          end
          # {http://classes.win32.server.sirius.org/}point
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
          # {http://classes.win32.server.sirius.org/}moveTo
          #   arg0 - SOAP::SOAPLong
          #   arg1 - SOAP::SOAPInt
          #   arg2 - SOAP::SOAPInt

          class MoveTo

            attr_accessor :arg0

            attr_accessor :arg1

            attr_accessor :arg2
            def initialize(arg0 = nil, arg1 = nil, arg2 = nil)  @arg0 = arg0
              @arg1 = arg1
              @arg2 = arg2

            end

          end
          # {http://classes.win32.server.sirius.org/}moveToResponse

          class MoveToResponse
            def initialize

            end

          end
          # {http://classes.win32.server.sirius.org/}isNormal
          #   arg0 - SOAP::SOAPLong

          class IsNormal

            attr_accessor :arg0
            def initialize(arg0 = nil)  @arg0 = arg0

            end

          end
          # {http://classes.win32.server.sirius.org/}isNormalResponse
          #   m_return - SOAP::SOAPBoolean

          class IsNormalResponse
            def m_return
              @v_return

            end

            def m_return=(value)  @v_return = value

            end

            def initialize(v_return = nil)  @v_return = v_return

            end

          end
          # {http://classes.win32.server.sirius.org/}isWindow
          #   arg0 - SOAP::SOAPLong

          class IsWindow

            attr_accessor :arg0
            def initialize(arg0 = nil)  @arg0 = arg0

            end

          end
          # {http://classes.win32.server.sirius.org/}isWindowResponse
          #   m_return - SOAP::SOAPBoolean

          class IsWindowResponse
            def m_return
              @v_return

            end

            def m_return=(value)  @v_return = value

            end

            def initialize(v_return = nil)  @v_return = v_return

            end

          end
          # {http://classes.win32.server.sirius.org/}isVisible
          #   arg0 - SOAP::SOAPLong

          class IsVisible

            attr_accessor :arg0
            def initialize(arg0 = nil)  @arg0 = arg0

            end

          end
          # {http://classes.win32.server.sirius.org/}isVisibleResponse
          #   m_return - SOAP::SOAPBoolean

          class IsVisibleResponse
            def m_return
              @v_return

            end

            def m_return=(value)  @v_return = value

            end

            def initialize(v_return = nil)  @v_return = v_return

            end

          end
          # {http://classes.win32.server.sirius.org/}activate
          #   arg0 - SOAP::SOAPLong

          class Activate

            attr_accessor :arg0
            def initialize(arg0 = nil)  @arg0 = arg0

            end

          end
          # {http://classes.win32.server.sirius.org/}activateResponse

          class ActivateResponse
            def initialize

            end

          end
          # {http://classes.win32.server.sirius.org/}getText
          #   arg0 - SOAP::SOAPLong

          class GetText

            attr_accessor :arg0
            def initialize(arg0 = nil)  @arg0 = arg0

            end

          end
          # {http://classes.win32.server.sirius.org/}getTextResponse
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
          # {http://classes.win32.server.sirius.org/}isMaximized
          #   arg0 - SOAP::SOAPLong

          class IsMaximized

            attr_accessor :arg0
            def initialize(arg0 = nil)  @arg0 = arg0

            end

          end
          # {http://classes.win32.server.sirius.org/}isMaximizedResponse
          #   m_return - SOAP::SOAPBoolean

          class IsMaximizedResponse
            def m_return
              @v_return

            end

            def m_return=(value)  @v_return = value

            end

            def initialize(v_return = nil)  @v_return = v_return

            end

          end
          # {http://classes.win32.server.sirius.org/}click
          #   arg0 - SOAP::SOAPLong
          #   arg1 - SOAP::SOAPInt
          #   arg2 - SOAP::SOAPInt
          #   arg3 - SOAP::SOAPInt
          #   arg4 - SOAP::SOAPBoolean
          #   arg5 - SOAP::SOAPBoolean
          #   arg6 - SOAP::SOAPBoolean

          class Click

            attr_accessor :arg0

            attr_accessor :arg1

            attr_accessor :arg2

            attr_accessor :arg3

            attr_accessor :arg4

            attr_accessor :arg5

            attr_accessor :arg6
            def initialize(arg0 = nil, arg1 = nil, arg2 = nil, arg3 = nil, arg4 = nil, arg5 = nil, arg6 = nil)  @arg0 = arg0
              @arg1 = arg1
              @arg2 = arg2
              @arg3 = arg3
              @arg4 = arg4
              @arg5 = arg5
              @arg6 = arg6

            end

          end
          # {http://classes.win32.server.sirius.org/}clickResponse

          class ClickResponse
            def initialize

            end

          end
          # {http://classes.win32.server.sirius.org/}close
          #   arg0 - SOAP::SOAPLong

          class Close

            attr_accessor :arg0
            def initialize(arg0 = nil)  @arg0 = arg0

            end

          end
          # {http://classes.win32.server.sirius.org/}closeResponse

          class CloseResponse
            def initialize

            end

          end
          # {http://classes.win32.server.sirius.org/}keyDown
          #   arg0 - SOAP::SOAPLong
          #   arg1 - SOAP::SOAPInt

          class KeyDown

            attr_accessor :arg0

            attr_accessor :arg1
            def initialize(arg0 = nil, arg1 = nil)  @arg0 = arg0
              @arg1 = arg1

            end

          end
          # {http://classes.win32.server.sirius.org/}keyDownResponse

          class KeyDownResponse
            def initialize

            end

          end
          # {http://classes.win32.server.sirius.org/}keyPress
          #   arg0 - SOAP::SOAPLong
          #   arg1 - SOAP::SOAPInt

          class KeyPress

            attr_accessor :arg0

            attr_accessor :arg1
            def initialize(arg0 = nil, arg1 = nil)  @arg0 = arg0
              @arg1 = arg1

            end

          end
          # {http://classes.win32.server.sirius.org/}keyPressResponse

          class KeyPressResponse
            def initialize

            end

          end
          # {http://classes.win32.server.sirius.org/}isMinimized
          #   arg0 - SOAP::SOAPLong

          class IsMinimized

            attr_accessor :arg0
            def initialize(arg0 = nil)  @arg0 = arg0

            end

          end
          # {http://classes.win32.server.sirius.org/}isMinimizedResponse
          #   m_return - SOAP::SOAPBoolean

          class IsMinimizedResponse
            def m_return
              @v_return

            end

            def m_return=(value)  @v_return = value

            end

            def initialize(v_return = nil)  @v_return = v_return

            end

          end
          # {http://classes.win32.server.sirius.org/}getMenu
          #   arg0 - SOAP::SOAPLong

          class GetMenu

            attr_accessor :arg0
            def initialize(arg0 = nil)  @arg0 = arg0

            end

          end
          # {http://classes.win32.server.sirius.org/}getMenuResponse
          #   m_return - SOAP::SOAPLong

          class GetMenuResponse
            def m_return
              @v_return

            end

            def m_return=(value)  @v_return = value

            end

            def initialize(v_return = nil)  @v_return = v_return

            end

          end
          # {http://classes.win32.server.sirius.org/}maximize
          #   arg0 - SOAP::SOAPLong

          class Maximize

            attr_accessor :arg0
            def initialize(arg0 = nil)  @arg0 = arg0

            end

          end
          # {http://classes.win32.server.sirius.org/}maximizeResponse

          class MaximizeResponse
            def initialize

            end

          end
          # {http://classes.win32.server.sirius.org/}getWindowPlacement
          #   arg0 - SOAP::SOAPLong
          #   arg1 - Sirius::Client::Win32::Core::Window::Windowplacement

          class GetWindowPlacement

            attr_accessor :arg0

            attr_accessor :arg1
            def initialize(arg0 = nil, arg1 = nil)  @arg0 = arg0
              @arg1 = arg1

            end

          end
          # {http://classes.win32.server.sirius.org/}getWindowPlacementResponse
          #   m_return - SOAP::SOAPBoolean

          class GetWindowPlacementResponse
            def m_return
              @v_return

            end

            def m_return=(value)  @v_return = value

            end

            def initialize(v_return = nil)  @v_return = v_return

            end

          end
          # {http://classes.win32.server.sirius.org/}getClientRect
          #   arg0 - SOAP::SOAPLong

          class GetClientRect

            attr_accessor :arg0
            def initialize(arg0 = nil)  @arg0 = arg0

            end

          end
          # {http://classes.win32.server.sirius.org/}getClientRectResponse
          #   m_return - Sirius::Client::Win32::Core::Window::Rect

          class GetClientRectResponse
            def m_return
              @v_return

            end

            def m_return=(value)  @v_return = value

            end

            def initialize(v_return = nil)  @v_return = v_return

            end

          end
          # {http://classes.win32.server.sirius.org/}mouseDown
          #   arg0 - SOAP::SOAPLong
          #   arg1 - SOAP::SOAPInt
          #   arg2 - SOAP::SOAPInt
          #   arg3 - SOAP::SOAPInt
          #   arg4 - SOAP::SOAPBoolean
          #   arg5 - SOAP::SOAPBoolean
          #   arg6 - SOAP::SOAPBoolean

          class MouseDown

            attr_accessor :arg0

            attr_accessor :arg1

            attr_accessor :arg2

            attr_accessor :arg3

            attr_accessor :arg4

            attr_accessor :arg5

            attr_accessor :arg6
            def initialize(arg0 = nil, arg1 = nil, arg2 = nil, arg3 = nil, arg4 = nil, arg5 = nil, arg6 = nil)  @arg0 = arg0
              @arg1 = arg1
              @arg2 = arg2
              @arg3 = arg3
              @arg4 = arg4
              @arg5 = arg5
              @arg6 = arg6

            end

          end
          # {http://classes.win32.server.sirius.org/}mouseDownResponse

          class MouseDownResponse
            def initialize

            end

          end
          # {http://classes.win32.server.sirius.org/}sizeTo
          #   arg0 - SOAP::SOAPLong
          #   arg1 - SOAP::SOAPInt
          #   arg2 - SOAP::SOAPInt

          class SizeTo

            attr_accessor :arg0

            attr_accessor :arg1

            attr_accessor :arg2
            def initialize(arg0 = nil, arg1 = nil, arg2 = nil)  @arg0 = arg0
              @arg1 = arg1
              @arg2 = arg2

            end

          end
          # {http://classes.win32.server.sirius.org/}sizeToResponse

          class SizeToResponse
            def initialize

            end

          end
          # {http://classes.win32.server.sirius.org/}restore
          #   arg0 - SOAP::SOAPLong

          class Restore

            attr_accessor :arg0
            def initialize(arg0 = nil)  @arg0 = arg0

            end

          end
          # {http://classes.win32.server.sirius.org/}restoreResponse

          class RestoreResponse
            def initialize

            end

          end
          # {http://classes.win32.server.sirius.org/}start
          #   arg0 - SOAP::SOAPLong
          #   arg1 - SOAP::SOAPString
          #   arg2 - SOAP::SOAPString
          #   arg3 - SOAP::SOAPString

          class Start

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
          # {http://classes.win32.server.sirius.org/}startResponse

          class StartResponse
            def initialize

            end

          end
          # {http://classes.win32.server.sirius.org/}mouseUp
          #   arg0 - SOAP::SOAPLong
          #   arg1 - SOAP::SOAPInt
          #   arg2 - SOAP::SOAPInt
          #   arg3 - SOAP::SOAPInt
          #   arg4 - SOAP::SOAPBoolean
          #   arg5 - SOAP::SOAPBoolean
          #   arg6 - SOAP::SOAPBoolean

          class MouseUp

            attr_accessor :arg0

            attr_accessor :arg1

            attr_accessor :arg2

            attr_accessor :arg3

            attr_accessor :arg4

            attr_accessor :arg5

            attr_accessor :arg6
            def initialize(arg0 = nil, arg1 = nil, arg2 = nil, arg3 = nil, arg4 = nil, arg5 = nil, arg6 = nil)  @arg0 = arg0
              @arg1 = arg1
              @arg2 = arg2
              @arg3 = arg3
              @arg4 = arg4
              @arg5 = arg5
              @arg6 = arg6

            end

          end
          # {http://classes.win32.server.sirius.org/}mouseUpResponse

          class MouseUpResponse
            def initialize

            end

          end
          # {http://classes.win32.server.sirius.org/}minimize
          #   arg0 - SOAP::SOAPLong

          class Minimize

            attr_accessor :arg0
            def initialize(arg0 = nil)  @arg0 = arg0

            end

          end
          # {http://classes.win32.server.sirius.org/}minimizeResponse

          class MinimizeResponse
            def initialize

            end

          end
          # {http://classes.win32.server.sirius.org/}isEnabled
          #   arg0 - SOAP::SOAPLong

          class IsEnabled

            attr_accessor :arg0
            def initialize(arg0 = nil)  @arg0 = arg0

            end

          end
          # {http://classes.win32.server.sirius.org/}isEnabledResponse
          #   m_return - SOAP::SOAPBoolean

          class IsEnabledResponse
            def m_return
              @v_return

            end

            def m_return=(value)  @v_return = value

            end

            def initialize(v_return = nil)  @v_return = v_return

            end

          end
          # {http://classes.win32.server.sirius.org/}isUnicode
          #   arg0 - SOAP::SOAPLong

          class IsUnicode

            attr_accessor :arg0
            def initialize(arg0 = nil)  @arg0 = arg0

            end

          end
          # {http://classes.win32.server.sirius.org/}isUnicodeResponse
          #   m_return - SOAP::SOAPBoolean

          class IsUnicodeResponse
            def m_return
              @v_return

            end

            def m_return=(value)  @v_return = value

            end

            def initialize(v_return = nil)  @v_return = v_return

            end

          end
          # {http://classes.win32.server.sirius.org/}doubleClick
          #   arg0 - SOAP::SOAPLong
          #   arg1 - SOAP::SOAPInt
          #   arg2 - SOAP::SOAPInt
          #   arg3 - SOAP::SOAPInt
          #   arg4 - SOAP::SOAPBoolean
          #   arg5 - SOAP::SOAPBoolean
          #   arg6 - SOAP::SOAPBoolean

          class DoubleClick

            attr_accessor :arg0

            attr_accessor :arg1

            attr_accessor :arg2

            attr_accessor :arg3

            attr_accessor :arg4

            attr_accessor :arg5

            attr_accessor :arg6
            def initialize(arg0 = nil, arg1 = nil, arg2 = nil, arg3 = nil, arg4 = nil, arg5 = nil, arg6 = nil)  @arg0 = arg0
              @arg1 = arg1
              @arg2 = arg2
              @arg3 = arg3
              @arg4 = arg4
              @arg5 = arg5
              @arg6 = arg6

            end

          end
          # {http://classes.win32.server.sirius.org/}doubleClickResponse

          class DoubleClickResponse
            def initialize

            end

          end

        end; end; end; end; end
