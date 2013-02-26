require 'xsd/qname'

module Sirius; module Client; module Win32; module Core; module Button

          # {http:controls.classes.win32.server.sirius.org/}GetState
          #   arg0 - SOAP::SOAPLong          class GetState
            attr_accessor :arg0
            def initialize(arg0 = nil)  @arg0 = arg0
            end
          end
          # {http:controls.classes.win32.server.sirius.org/}GetStateResponse
          #   m_return - SOAP::SOAPInt
          class GetStateResponse            def m_return
              @v_return
            end

            def m_return=(value)  @v_return = value
            end

            def initialize(v_return = nil)  @v_return = v_return
            end
          end
          # {http:controls.classes.win32.server.sirius.org/}SetCheck
          #   arg0 - SOAP::SOAPLong
          #   arg1 - SOAP::SOAPInt
          class SetCheck
            attr_accessor :arg0
            attr_accessor :arg1
            def initialize(arg0 = nil, arg1 = nil)  @arg0 = arg0
              @arg1 = arg1
            end
          end
          # {http:controls.classes.win32.server.sirius.org/}SetCheckResponse
          class SetCheckResponse            def initialize
            end
          end
          # {http:controls.classes.win32.server.sirius.org/}SetState
          #   arg0 - SOAP::SOAPLong
          #   arg1 - SOAP::SOAPInt
          class SetState
            attr_accessor :arg0
            attr_accessor :arg1
            def initialize(arg0 = nil, arg1 = nil)  @arg0 = arg0
              @arg1 = arg1
            end
          end
          # {http:controls.classes.win32.server.sirius.org/}SetStateResponse
          class SetStateResponse            def initialize
            end
          end
          # {http:controls.classes.win32.server.sirius.org/}GetCheck
          #   arg0 - SOAP::SOAPLong
          class GetCheck
            attr_accessor :arg0
            def initialize(arg0 = nil)  @arg0 = arg0
            end
          end
          # {http:controls.classes.win32.server.sirius.org/}GetCheckResponse
          #   m_return - SOAP::SOAPInt
          class GetCheckResponse            def m_return
              @v_return
            end

            def m_return=(value)  @v_return = value
            end

            def initialize(v_return = nil)  @v_return = v_return
            end
          end

        end; end; end; end; end
