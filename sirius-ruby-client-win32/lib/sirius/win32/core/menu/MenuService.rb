require 'xsd/qname'

module Sirius; module Client; module Win32; module Core; module Menu

          # {http://classes.win32.server.sirius.org/}GetMenuItemCount
          #   arg0 - SOAP::SOAPLong          class GetMenuItemCount
            attr_accessor :arg0
            def initialize(arg0 = nil)  @arg0 = arg0
            end
          end
          # {http://classes.win32.server.sirius.org/}GetMenuItemCountResponse
          #   m_return - SOAP::SOAPInt
          class GetMenuItemCountResponse            def m_return
              @v_return
            end

            def m_return=(value)  @v_return = value
            end

            def initialize(v_return = nil)  @v_return = v_return
            end
          end
          # {http://classes.win32.server.sirius.org/}pickItem
          #   arg0 - SOAP::SOAPLong
          #   arg1 - SOAP::SOAPLong
          #   arg2 - SOAP::SOAPInt
          class PickItem
            attr_accessor :arg0
            attr_accessor :arg1
            attr_accessor :arg2
            def initialize(arg0 = nil, arg1 = nil, arg2 = nil)  @arg0 = arg0
              @arg1 = arg1
              @arg2 = arg2
            end
          end
          # {http://classes.win32.server.sirius.org/}pickItemResponse
          #   m_return - SOAP::SOAPBoolean
          class PickItemResponse            def m_return
              @v_return
            end

            def m_return=(value)  @v_return = value
            end

            def initialize(v_return = nil)  @v_return = v_return
            end
          end
          # {http://classes.win32.server.sirius.org/}GetMenuItemInfo
          #   arg0 - SOAP::SOAPLong
          #   arg1 - SOAP::SOAPInt
          #   arg2 - SOAP::SOAPBoolean
          #   arg3 - Sirius::Client::Win32::Core::Menu::Menuiteminfo
          class GetMenuItemInfo
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
          # {http://classes.win32.server.sirius.org/}menuiteminfo
          #   autoRead - SOAP::SOAPBoolean
          #   autoWrite - SOAP::SOAPBoolean
          #   cbSize - SOAP::SOAPInt
          #   fMask - Sirius::Client::Win32::Core::Menu::Uint
          #   fType - Sirius::Client::Win32::Core::Menu::Uint
          #   fState - Sirius::Client::Win32::Core::Menu::Uint
          #   wID - Sirius::Client::Win32::Core::Menu::Uint
          #   hSubMenu - Sirius::Client::Win32::Core::Menu::Hmenu
          #   hbmpChecked - Sirius::Client::Win32::Core::Menu::Hbitmap
          #   hbmpUnchecked - Sirius::Client::Win32::Core::Menu::Hbitmap
          #   dwItemData - Sirius::Client::Win32::Core::Menu::UlongPTR
          #   dwTypeData - SOAP::SOAPString
          #   cch - Sirius::Client::Win32::Core::Menu::Uint
          #   hbmpItem - Sirius::Client::Win32::Core::Menu::Hbitmap
          class Menuiteminfo < Structure
            attr_accessor :autoRead
            attr_accessor :autoWrite
            attr_accessor :cbSize
            attr_accessor :fMask
            attr_accessor :fType
            attr_accessor :fState
            attr_accessor :wID
            attr_accessor :hSubMenu
            attr_accessor :hbmpChecked
            attr_accessor :hbmpUnchecked
            attr_accessor :dwItemData
            attr_accessor :dwTypeData
            attr_accessor :cch
            attr_accessor :hbmpItem
            def initialize(autoRead = nil, autoWrite = nil, cbSize = nil, fMask = nil, fType = nil, fState = nil, wID = nil, hSubMenu = nil, hbmpChecked = nil, hbmpUnchecked = nil, dwItemData = nil, dwTypeData = nil, cch = nil, hbmpItem = nil)  @autoRead = autoRead
              @autoWrite = autoWrite
              @cbSize = cbSize
              @fMask = fMask
              @fType = fType
              @fState = fState
              @wID = wID
              @hSubMenu = hSubMenu
              @hbmpChecked = hbmpChecked
              @hbmpUnchecked = hbmpUnchecked
              @dwItemData = dwItemData
              @dwTypeData = dwTypeData
              @cch = cch
              @hbmpItem = hbmpItem
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
          # {http://classes.win32.server.sirius.org/}menuinfo
          #   autoRead - SOAP::SOAPBoolean
          #   autoWrite - SOAP::SOAPBoolean
          #   cbSize - SOAP::SOAPInt
          #   fMask - Sirius::Client::Win32::Core::Menu::Dword
          #   dwStyle - Sirius::Client::Win32::Core::Menu::Dword
          #   cyMax - Sirius::Client::Win32::Core::Menu::Uint
          #   hbrBack - Sirius::Client::Win32::Core::Menu::Hbrush
          #   dwContextHelpID - Sirius::Client::Win32::Core::Menu::Dword
          #   dwMenuData - Sirius::Client::Win32::Core::Menu::UlongPTR
          class Menuinfo < Structure
            attr_accessor :autoRead
            attr_accessor :autoWrite
            attr_accessor :cbSize
            attr_accessor :fMask
            attr_accessor :dwStyle
            attr_accessor :cyMax
            attr_accessor :hbrBack
            attr_accessor :dwContextHelpID
            attr_accessor :dwMenuData
            def initialize(autoRead = nil, autoWrite = nil, cbSize = nil, fMask = nil, dwStyle = nil, cyMax = nil, hbrBack = nil, dwContextHelpID = nil, dwMenuData = nil)  @autoRead = autoRead
              @autoWrite = autoWrite
              @cbSize = cbSize
              @fMask = fMask
              @dwStyle = dwStyle
              @cyMax = cyMax
              @hbrBack = hbrBack
              @dwContextHelpID = dwContextHelpID
              @dwMenuData = dwMenuData
            end
          end
          # {http://classes.win32.server.sirius.org/}number
          # abstract
          class Number            def initialize
            end
          end
          # {http://classes.win32.server.sirius.org/}integerType
          # abstract
          class IntegerType < Number            def initialize
            end
          end
          # {http://classes.win32.server.sirius.org/}dword
          class Dword < IntegerType            def initialize
            end
          end
          # {http://classes.win32.server.sirius.org/}uint
          class Uint < Dword            def initialize
            end
          end
          # {http://classes.win32.server.sirius.org/}ulongPTR
          class UlongPTR < IntegerType            def initialize
            end
          end
          # {http://classes.win32.server.sirius.org/}pointerType
          # abstract
          #   pointer - Sirius::Client::Win32::Core::Menu::Pointer
          class PointerType
            attr_accessor :pointer
            def initialize(pointer = nil)  @pointer = pointer
            end
          end
          # {http://classes.win32.server.sirius.org/}handle
          #   pointer - Sirius::Client::Win32::Core::Menu::Pointer
          class Handle < PointerType
            attr_accessor :pointer
            def initialize(pointer = nil)  @pointer = pointer
            end
          end
          # {http://classes.win32.server.sirius.org/}hmenu
          #   pointer - Sirius::Client::Win32::Core::Menu::Pointer
          class Hmenu < Handle
            attr_accessor :pointer
            def initialize(pointer = nil)  @pointer = pointer
            end
          end
          # {http://classes.win32.server.sirius.org/}hbitmap
          #   pointer - Sirius::Client::Win32::Core::Menu::Pointer
          class Hbitmap < Handle
            attr_accessor :pointer
            def initialize(pointer = nil)  @pointer = pointer
            end
          end
          # {http://classes.win32.server.sirius.org/}hbrush
          #   pointer - Sirius::Client::Win32::Core::Menu::Pointer
          class Hbrush < Handle
            attr_accessor :pointer
            def initialize(pointer = nil)  @pointer = pointer
            end
          end
          # {http://classes.win32.server.sirius.org/}pointer
          class Pointer            def initialize
            end
          end
          # {http://classes.win32.server.sirius.org/}GetMenuItemInfoResponse
          #   m_return - SOAP::SOAPBoolean
          class GetMenuItemInfoResponse            def m_return
              @v_return
            end

            def m_return=(value)  @v_return = value
            end

            def initialize(v_return = nil)  @v_return = v_return
            end
          end
          # {http://classes.win32.server.sirius.org/}GetMenuState
          #   arg0 - SOAP::SOAPLong
          #   arg1 - SOAP::SOAPInt
          #   arg2 - SOAP::SOAPInt
          class GetMenuState
            attr_accessor :arg0
            attr_accessor :arg1
            attr_accessor :arg2
            def initialize(arg0 = nil, arg1 = nil, arg2 = nil)  @arg0 = arg0
              @arg1 = arg1
              @arg2 = arg2
            end
          end
          # {http://classes.win32.server.sirius.org/}GetMenuStateResponse
          #   m_return - SOAP::SOAPInt
          class GetMenuStateResponse            def m_return
              @v_return
            end

            def m_return=(value)  @v_return = value
            end

            def initialize(v_return = nil)  @v_return = v_return
            end
          end
          # {http://classes.win32.server.sirius.org/}GetMenuString
          #   arg0 - SOAP::SOAPLong
          #   arg1 - SOAP::SOAPInt
          #   arg2 - SOAP::SOAPUnsignedShort
          #   arg3 - SOAP::SOAPInt
          #   arg4 - SOAP::SOAPInt
          class GetMenuString
            attr_accessor :arg0
            attr_accessor :arg1
            attr_accessor :arg2
            attr_accessor :arg3
            attr_accessor :arg4
            def initialize(arg0 = nil, arg1 = nil, arg2 = [], arg3 = nil, arg4 = nil)  @arg0 = arg0
              @arg1 = arg1
              @arg2 = arg2
              @arg3 = arg3
              @arg4 = arg4
            end
          end
          # {http://classes.win32.server.sirius.org/}GetMenuStringResponse
          #   m_return - SOAP::SOAPInt
          class GetMenuStringResponse            def m_return
              @v_return
            end

            def m_return=(value)  @v_return = value
            end

            def initialize(v_return = nil)  @v_return = v_return
            end
          end
          # {http://classes.win32.server.sirius.org/}GetMenuItemRect
          #   arg0 - SOAP::SOAPLong
          #   arg1 - SOAP::SOAPLong
          #   arg2 - SOAP::SOAPInt
          #   arg3 - Sirius::Client::Win32::Core::Menu::Rect
          class GetMenuItemRect
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
          # {http://classes.win32.server.sirius.org/}GetMenuItemRectResponse
          #   m_return - SOAP::SOAPBoolean
          class GetMenuItemRectResponse            def m_return
              @v_return
            end

            def m_return=(value)  @v_return = value
            end

            def initialize(v_return = nil)  @v_return = v_return
            end
          end
          # {http://classes.win32.server.sirius.org/}GetMenuItemID
          #   arg0 - SOAP::SOAPLong
          #   arg1 - SOAP::SOAPInt
          class GetMenuItemID
            attr_accessor :arg0
            attr_accessor :arg1
            def initialize(arg0 = nil, arg1 = nil)  @arg0 = arg0
              @arg1 = arg1
            end
          end
          # {http://classes.win32.server.sirius.org/}GetMenuItemIDResponse
          #   m_return - SOAP::SOAPInt
          class GetMenuItemIDResponse            def m_return
              @v_return
            end

            def m_return=(value)  @v_return = value
            end

            def initialize(v_return = nil)  @v_return = v_return
            end
          end
          # {http://classes.win32.server.sirius.org/}GetMenuDefaultItem
          #   arg0 - SOAP::SOAPLong
          #   arg1 - SOAP::SOAPInt
          #   arg2 - SOAP::SOAPInt
          class GetMenuDefaultItem
            attr_accessor :arg0
            attr_accessor :arg1
            attr_accessor :arg2
            def initialize(arg0 = nil, arg1 = nil, arg2 = nil)  @arg0 = arg0
              @arg1 = arg1
              @arg2 = arg2
            end
          end
          # {http://classes.win32.server.sirius.org/}GetMenuDefaultItemResponse
          #   m_return - SOAP::SOAPInt
          class GetMenuDefaultItemResponse            def m_return
              @v_return
            end

            def m_return=(value)  @v_return = value
            end

            def initialize(v_return = nil)  @v_return = v_return
            end
          end
          # {http://classes.win32.server.sirius.org/}GetMenuInfo
          #   arg0 - SOAP::SOAPLong
          #   arg1 - Sirius::Client::Win32::Core::Menu::Menuinfo
          class GetMenuInfo
            attr_accessor :arg0
            attr_accessor :arg1
            def initialize(arg0 = nil, arg1 = nil)  @arg0 = arg0
              @arg1 = arg1
            end
          end
          # {http://classes.win32.server.sirius.org/}GetMenuInfoResponse
          #   m_return - SOAP::SOAPBoolean
          class GetMenuInfoResponse            def m_return
              @v_return
            end

            def m_return=(value)  @v_return = value
            end

            def initialize(v_return = nil)  @v_return = v_return
            end
          end
          # {http://classes.win32.server.sirius.org/}IsMenu
          #   arg0 - SOAP::SOAPLong
          class IsMenu
            attr_accessor :arg0
            def initialize(arg0 = nil)  @arg0 = arg0
            end
          end
          # {http://classes.win32.server.sirius.org/}IsMenuResponse
          #   m_return - SOAP::SOAPBoolean
          class IsMenuResponse            def m_return
              @v_return
            end

            def m_return=(value)  @v_return = value
            end

            def initialize(v_return = nil)  @v_return = v_return
            end
          end
          # {http://classes.win32.server.sirius.org/}GetSubMenu
          #   arg0 - SOAP::SOAPLong
          #   arg1 - SOAP::SOAPInt
          class GetSubMenu
            attr_accessor :arg0
            attr_accessor :arg1
            def initialize(arg0 = nil, arg1 = nil)  @arg0 = arg0
              @arg1 = arg1
            end
          end
          # {http://classes.win32.server.sirius.org/}GetSubMenuResponse
          #   m_return - SOAP::SOAPLong
          class GetSubMenuResponse            def m_return
              @v_return
            end

            def m_return=(value)  @v_return = value
            end

            def initialize(v_return = nil)  @v_return = v_return
            end
          end

        end; end; end; end; end
