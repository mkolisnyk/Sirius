require 'xsd/qname'

module Sirius; module Client; module Win32; module Core; module Utils

          # {http:win32.server.sirius.org/}searchSameThreadWindow
          #   arg0 - SOAP::SOAPLong
          #   arg1 - Sirius::Client::Win32::Core::Utils::Win32Locator
          class SearchSameThreadWindow

            attr_accessor :arg0
            attr_accessor :arg1
            
            def initialize(arg0 = nil, arg1 = nil)
              @arg0 = arg0
              @arg1 = arg1
            end
          end
          
          # {http:win32.server.sirius.org/}win32Locator
          #   caption - SOAP::SOAPString
          #   hwnd - SOAP::SOAPLong
          #   index - SOAP::SOAPInt
          #   parent - SOAP::SOAPLong
          #   winClass - SOAP::SOAPString
          class Win32Locator

            attr_accessor :caption
            attr_accessor :hwnd
            attr_accessor :index
            attr_accessor :parent
            attr_accessor :winClass

            def initialize(caption = nil, hwnd = nil, index = nil, parent = nil, winClass = nil)
              @caption = caption
              @hwnd = hwnd
              @index = index
              @parent = parent
              @winClass = winClass

            end

          end
          # {http:win32.server.sirius.org/}searchSameThreadWindowResponse
          #   m_return - SOAP::SOAPLong

          class SearchSameThreadWindowResponse
            def m_return
              @v_return

            end

            def m_return=(value)  @v_return = value

            end

            def initialize(v_return = nil)  @v_return = v_return

            end

          end
          # {http:win32.server.sirius.org/}searchWindow
          #   arg0 - Sirius::Client::Win32::Core::Utils::Win32Locator

          class SearchWindow

            attr_accessor :arg0
            def initialize(arg0 = nil)  @arg0 = arg0

            end

          end
          # {http:win32.server.sirius.org/}searchWindowResponse
          #   m_return - SOAP::SOAPLong

          class SearchWindowResponse
            def m_return
              @v_return

            end

            def m_return=(value)  @v_return = value

            end

            def initialize(v_return = nil)  @v_return = v_return

            end

          end

        end; end; end; end; end
