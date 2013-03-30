require 'xsd/qname'

module Sirius; module Client; module Win32; module Core; module Dialog

          # {http://classes.win32.server.sirius.org/}setDlgItemText
          #   arg0 - SOAP::SOAPLong
          #   arg1 - SOAP::SOAPInt
          #   arg2 - SOAP::SOAPString          class SetDlgItemText
            attr_accessor :arg0
            attr_accessor :arg1
            attr_accessor :arg2
            def initialize(arg0 = nil, arg1 = nil, arg2 = nil)  @arg0 = arg0
              @arg1 = arg1
              @arg2 = arg2
            end
          end
          # {http://classes.win32.server.sirius.org/}setDlgItemTextResponse
          #   m_return - SOAP::SOAPBoolean
          class SetDlgItemTextResponse            def m_return
              @v_return
            end

            def m_return=(value)  @v_return = value
            end

            def initialize(v_return = nil)  @v_return = v_return
            end
          end
          # {http://classes.win32.server.sirius.org/}getDlgItem
          #   arg0 - SOAP::SOAPLong
          #   arg1 - SOAP::SOAPInt
          class GetDlgItem
            attr_accessor :arg0
            attr_accessor :arg1
            def initialize(arg0 = nil, arg1 = nil)  @arg0 = arg0
              @arg1 = arg1
            end
          end
          # {http://classes.win32.server.sirius.org/}getDlgItemResponse
          #   m_return - SOAP::SOAPLong
          class GetDlgItemResponse            def m_return
              @v_return
            end

            def m_return=(value)  @v_return = value
            end

            def initialize(v_return = nil)  @v_return = v_return
            end
          end
          # {http://classes.win32.server.sirius.org/}getDlgCtrlID
          #   arg0 - SOAP::SOAPLong
          class GetDlgCtrlID
            attr_accessor :arg0
            def initialize(arg0 = nil)  @arg0 = arg0
            end
          end
          # {http://classes.win32.server.sirius.org/}getDlgCtrlIDResponse
          #   m_return - SOAP::SOAPInt
          class GetDlgCtrlIDResponse            def m_return
              @v_return
            end

            def m_return=(value)  @v_return = value
            end

            def initialize(v_return = nil)  @v_return = v_return
            end
          end
          # {http://classes.win32.server.sirius.org/}setDlgItemInt
          #   arg0 - SOAP::SOAPLong
          #   arg1 - SOAP::SOAPInt
          #   arg2 - SOAP::SOAPInt
          #   arg3 - SOAP::SOAPBoolean
          class SetDlgItemInt
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
          # {http://classes.win32.server.sirius.org/}setDlgItemIntResponse
          #   m_return - SOAP::SOAPBoolean
          class SetDlgItemIntResponse            def m_return
              @v_return
            end

            def m_return=(value)  @v_return = value
            end

            def initialize(v_return = nil)  @v_return = v_return
            end
          end
          # {http://classes.win32.server.sirius.org/}getDlgItemInt
          #   arg0 - SOAP::SOAPLong
          #   arg1 - SOAP::SOAPInt
          #   arg2 - SOAP::SOAPBoolean
          #   arg3 - SOAP::SOAPBoolean
          class GetDlgItemInt
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
          # {http://classes.win32.server.sirius.org/}getDlgItemIntResponse
          #   m_return - SOAP::SOAPInt
          class GetDlgItemIntResponse            def m_return
              @v_return
            end

            def m_return=(value)  @v_return = value
            end

            def initialize(v_return = nil)  @v_return = v_return
            end
          end
          # {http://classes.win32.server.sirius.org/}getDialogBaseUnits
          class GetDialogBaseUnits            def initialize
            end
          end
          # {http://classes.win32.server.sirius.org/}getDialogBaseUnitsResponse
          #   m_return - SOAP::SOAPLong
          class GetDialogBaseUnitsResponse            def m_return
              @v_return
            end

            def m_return=(value)  @v_return = value
            end

            def initialize(v_return = nil)  @v_return = v_return
            end
          end
          # {http://classes.win32.server.sirius.org/}getDlgItemTextA
          #   arg0 - SOAP::SOAPLong
          #   arg1 - SOAP::SOAPInt
          class GetDlgItemTextA
            attr_accessor :arg0
            attr_accessor :arg1
            def initialize(arg0 = nil, arg1 = nil)  @arg0 = arg0
              @arg1 = arg1
            end
          end
          # {http://classes.win32.server.sirius.org/}getDlgItemTextAResponse
          #   m_return - SOAP::SOAPString
          class GetDlgItemTextAResponse            def m_return
              @v_return
            end

            def m_return=(value)  @v_return = value
            end

            def initialize(v_return = nil)  @v_return = v_return
            end
          end
          # {http://classes.win32.server.sirius.org/}isDlgButtonChecked
          #   arg0 - SOAP::SOAPLong
          #   arg1 - SOAP::SOAPInt
          class IsDlgButtonChecked
            attr_accessor :arg0
            attr_accessor :arg1
            def initialize(arg0 = nil, arg1 = nil)  @arg0 = arg0
              @arg1 = arg1
            end
          end
          # {http://classes.win32.server.sirius.org/}isDlgButtonCheckedResponse
          #   m_return - SOAP::SOAPInt
          class IsDlgButtonCheckedResponse            def m_return
              @v_return
            end

            def m_return=(value)  @v_return = value
            end

            def initialize(v_return = nil)  @v_return = v_return
            end
          end

        end; end; end; end; end
