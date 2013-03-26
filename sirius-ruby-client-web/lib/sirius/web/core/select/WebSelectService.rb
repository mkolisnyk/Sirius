require 'xsd/qname'

module Sirius; module Client; module Win32; module Core; module Select

          # {http:web.server.sirius.org/}deselectByVisibleText
          #   arg0 - SOAP::SOAPString
          #   arg1 - SOAP::SOAPString
          #   arg2 - SOAP::SOAPString
          #   arg3 - SOAP::SOAPString          class DeselectByVisibleText
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
          # {http:web.server.sirius.org/}deselectByVisibleTextResponse
          class DeselectByVisibleTextResponse            def initialize
            end
          end
          # {http:web.server.sirius.org/}selectByValue
          #   arg0 - SOAP::SOAPString
          #   arg1 - SOAP::SOAPString
          #   arg2 - SOAP::SOAPString
          #   arg3 - SOAP::SOAPString
          class SelectByValue
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
          # {http:web.server.sirius.org/}selectByValueResponse
          class SelectByValueResponse            def initialize
            end
          end
          # {http:web.server.sirius.org/}selectByVisibleText
          #   arg0 - SOAP::SOAPString
          #   arg1 - SOAP::SOAPString
          #   arg2 - SOAP::SOAPString
          #   arg3 - SOAP::SOAPString
          class SelectByVisibleText
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
          # {http:web.server.sirius.org/}selectByVisibleTextResponse
          class SelectByVisibleTextResponse            def initialize
            end
          end
          # {http:web.server.sirius.org/}getAllSelectedOptions
          #   arg0 - SOAP::SOAPString
          #   arg1 - SOAP::SOAPString
          #   arg2 - SOAP::SOAPString
          class GetAllSelectedOptions
            attr_accessor :arg0
            attr_accessor :arg1
            attr_accessor :arg2
            def initialize(arg0 = nil, arg1 = nil, arg2 = nil)  @arg0 = arg0
              @arg1 = arg1
              @arg2 = arg2
            end
          end
          # {http:web.server.sirius.org/}getAllSelectedOptionsResponse
          class GetAllSelectedOptionsResponse < ::Array
          end
          # {http:web.server.sirius.org/}deselectByIndex
          #   arg0 - SOAP::SOAPString
          #   arg1 - SOAP::SOAPString
          #   arg2 - SOAP::SOAPString
          #   arg3 - SOAP::SOAPInt
          class DeselectByIndex
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
          # {http:web.server.sirius.org/}deselectByIndexResponse
          class DeselectByIndexResponse            def initialize
            end
          end
          # {http:web.server.sirius.org/}deselectAll
          #   arg0 - SOAP::SOAPString
          #   arg1 - SOAP::SOAPString
          #   arg2 - SOAP::SOAPString
          class DeselectAll
            attr_accessor :arg0
            attr_accessor :arg1
            attr_accessor :arg2
            def initialize(arg0 = nil, arg1 = nil, arg2 = nil)  @arg0 = arg0
              @arg1 = arg1
              @arg2 = arg2
            end
          end
          # {http:web.server.sirius.org/}deselectAllResponse
          class DeselectAllResponse            def initialize
            end
          end
          # {http:web.server.sirius.org/}selectByIndex
          #   arg0 - SOAP::SOAPString
          #   arg1 - SOAP::SOAPString
          #   arg2 - SOAP::SOAPString
          #   arg3 - SOAP::SOAPInt
          class SelectByIndex
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
          # {http:web.server.sirius.org/}selectByIndexResponse
          class SelectByIndexResponse            def initialize
            end
          end
          # {http:web.server.sirius.org/}getAllOptions
          #   arg0 - SOAP::SOAPString
          #   arg1 - SOAP::SOAPString
          #   arg2 - SOAP::SOAPString
          class GetAllOptions
            attr_accessor :arg0
            attr_accessor :arg1
            attr_accessor :arg2
            def initialize(arg0 = nil, arg1 = nil, arg2 = nil)  @arg0 = arg0
              @arg1 = arg1
              @arg2 = arg2
            end
          end
          # {http:web.server.sirius.org/}getAllOptionsResponse
          class GetAllOptionsResponse < ::Array
          end
          # {http:web.server.sirius.org/}getFirstSelectedOption
          #   arg0 - SOAP::SOAPString
          #   arg1 - SOAP::SOAPString
          #   arg2 - SOAP::SOAPString
          class GetFirstSelectedOption
            attr_accessor :arg0
            attr_accessor :arg1
            attr_accessor :arg2
            def initialize(arg0 = nil, arg1 = nil, arg2 = nil)  @arg0 = arg0
              @arg1 = arg1
              @arg2 = arg2
            end
          end
          # {http:web.server.sirius.org/}getFirstSelectedOptionResponse
          #   m_return - SOAP::SOAPString
          class GetFirstSelectedOptionResponse            def m_return
              @v_return            end

            def m_return=(value)  @v_return = value
            end

            def initialize(v_return = nil)  @v_return = v_return
            end
          end
          # {http:web.server.sirius.org/}isMultiple
          #   arg0 - SOAP::SOAPString
          #   arg1 - SOAP::SOAPString
          #   arg2 - SOAP::SOAPString
          class IsMultiple
            attr_accessor :arg0
            attr_accessor :arg1
            attr_accessor :arg2
            def initialize(arg0 = nil, arg1 = nil, arg2 = nil)  @arg0 = arg0
              @arg1 = arg1
              @arg2 = arg2
            end
          end
          # {http:web.server.sirius.org/}isMultipleResponse
          #   m_return - SOAP::SOAPBoolean
          class IsMultipleResponse            def m_return
              @v_return
            end

            def m_return=(value)  @v_return = value
            end

            def initialize(v_return = nil)  @v_return = v_return
            end
          end
          # {http:web.server.sirius.org/}deselectByValue
          #   arg0 - SOAP::SOAPString
          #   arg1 - SOAP::SOAPString
          #   arg2 - SOAP::SOAPString
          #   arg3 - SOAP::SOAPString
          class DeselectByValue
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
          # {http:web.server.sirius.org/}deselectByValueResponse
          class DeselectByValueResponse            def initialize
            end
          end

        end; end; end; end; end
