require 'xsd/qname'

module Sirius; module Client; module Win32; module Core; module Slider


# {http:controls.classes.win32.server.sirius.org/}setPosition
#   arg0 - SOAP::SOAPInt
#   arg1 - SOAP::SOAPDouble
class SetPosition    
  attr_accessor :arg0    
  attr_accessor :arg1

    def initialize(arg0 = nil, arg1 = nil)  @arg0 = arg0
    @arg1 = arg1
  end
end
# {http:controls.classes.win32.server.sirius.org/}setPositionResponse
class SetPositionResponse  
    def initialize
  end
end
# {http:controls.classes.win32.server.sirius.org/}getPosition
#   arg0 - SOAP::SOAPInt
class GetPosition    
  attr_accessor :arg0

    def initialize(arg0 = nil)  @arg0 = arg0
  end
end
# {http:controls.classes.win32.server.sirius.org/}getPositionResponse
#   m_return - SOAP::SOAPDouble
class GetPositionResponse  
    def m_return
  @v_return
  end

    def m_return=(value)  @v_return = value
  end

    def initialize(v_return = nil)  @v_return = v_return
  end
end
# {http:controls.classes.win32.server.sirius.org/}getUpperBound
#   arg0 - SOAP::SOAPInt
class GetUpperBound    
  attr_accessor :arg0

    def initialize(arg0 = nil)  @arg0 = arg0
  end
end
# {http:controls.classes.win32.server.sirius.org/}getUpperBoundResponse
#   m_return - SOAP::SOAPDouble
class GetUpperBoundResponse  
    def m_return
  @v_return
  end

    def m_return=(value)  @v_return = value
  end

    def initialize(v_return = nil)  @v_return = v_return
  end
end
# {http:controls.classes.win32.server.sirius.org/}getLowerBound
#   arg0 - SOAP::SOAPInt
class GetLowerBound    
  attr_accessor :arg0

    def initialize(arg0 = nil)  @arg0 = arg0
  end
end
# {http:controls.classes.win32.server.sirius.org/}getLowerBoundResponse
#   m_return - SOAP::SOAPDouble
class GetLowerBoundResponse  
    def m_return
  @v_return
  end

    def m_return=(value)  @v_return = value
  end

    def initialize(v_return = nil)  @v_return = v_return
  end
end

end; end; end; end; end
