require 'xsd/qname'

module Sirius; module Client; module Win32; module Core; module Spin


# {http:controls.classes.win32.server.sirius.org/}decrement
#   arg0 - SOAP::SOAPInt
class Decrement    
  attr_accessor :arg0

    def initialize(arg0 = nil)  @arg0 = arg0
  end
end

# {http:controls.classes.win32.server.sirius.org/}decrementResponse
class DecrementResponse  
    def initialize
  end
end

# {http:controls.classes.win32.server.sirius.org/}getPosition
#   arg0 - SOAP::SOAPIntclass GetPosition    
  attr_accessor :arg0

    def initialize(arg0 = nil)  @arg0 = arg0
  end
end

# {http:controls.classes.win32.server.sirius.org/}getPositionResponse
#   m_return - SOAP::SOAPDoubleclass GetPositionResponse  
    def m_return
      @v_return
  end

    def m_return=(value)  @v_return = value
  end

    def initialize(v_return = nil)  @v_return = v_return
  end
end

# {http:controls.classes.win32.server.sirius.org/}setText
#   arg0 - SOAP::SOAPInt
#   arg1 - SOAP::SOAPStringclass SetText    
  attr_accessor :arg0    
  attr_accessor :arg1

    def initialize(arg0 = nil, arg1 = nil)  @arg0 = arg0
    @arg1 = arg1
  end
end
# {http:controls.classes.win32.server.sirius.org/}setTextResponse
class SetTextResponse  
    def initialize
  end
end
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
# {http:controls.classes.win32.server.sirius.org/}getLargeStep
#   arg0 - SOAP::SOAPInt
class GetLargeStep    
  attr_accessor :arg0

    def initialize(arg0 = nil)  @arg0 = arg0
  end
end
# {http:controls.classes.win32.server.sirius.org/}getLargeStepResponse
#   m_return - SOAP::SOAPDouble
class GetLargeStepResponse  
    def m_return
      @v_return
  end

    def m_return=(value)  @v_return = value
  end

    def initialize(v_return = nil)  @v_return = v_return
  end
end
# {http:controls.classes.win32.server.sirius.org/}getSmallStep
#   arg0 - SOAP::SOAPInt
class GetSmallStep    
  attr_accessor :arg0

    def initialize(arg0 = nil)  @arg0 = arg0
  end
end
# {http:controls.classes.win32.server.sirius.org/}getSmallStepResponse
#   m_return - SOAP::SOAPDouble
class GetSmallStepResponse  
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

# {http:controls.classes.win32.server.sirius.org/}getUpperBound
#   arg0 - SOAP::SOAPIntclass GetUpperBound    
  attr_accessor :arg0

    def initialize(arg0 = nil)  @arg0 = arg0
  end
end

# {http:controls.classes.win32.server.sirius.org/}getUpperBoundResponse
#   m_return - SOAP::SOAPDoubleclass GetUpperBoundResponse  
    def m_return
      @v_return
  end

    def m_return=(value)  @v_return = value
  end

    def initialize(v_return = nil)  @v_return = v_return
  end
end

# {http:controls.classes.win32.server.sirius.org/}getText
#   arg0 - SOAP::SOAPIntclass GetText    
  attr_accessor :arg0

    def initialize(arg0 = nil)  @arg0 = arg0
  end
end

# {http:controls.classes.win32.server.sirius.org/}getTextResponse
#   m_return - SOAP::SOAPStringclass GetTextResponse  
    def m_return
      @v_return
  end

    def m_return=(value)  @v_return = value
  end

    def initialize(v_return = nil)  @v_return = v_return
  end
end

# {http:controls.classes.win32.server.sirius.org/}increment
#   arg0 - SOAP::SOAPIntclass Increment    
  attr_accessor :arg0

    def initialize(arg0 = nil)  @arg0 = arg0
  end
end

# {http:controls.classes.win32.server.sirius.org/}incrementResponseclass IncrementResponse  
    def initialize
  end
end

end; end; end; end; end
