require 'xsd/qname'

module Sirius; module Client; module Win32; module Core; module Button


# {http:controls.classes.win32.server.sirius.org/}getState
#   arg0 - SOAP::SOAPLong
class GetState    
  attr_accessor :arg0

    def initialize(arg0 = nil)  @arg0 = arg0
  end
end
# {http:controls.classes.win32.server.sirius.org/}getStateResponse
#   m_return - SOAP::SOAPInt
class GetStateResponse  
    def m_return
  @v_return
  end

    def m_return=(value)  @v_return = value
  end

    def initialize(v_return = nil)  @v_return = v_return
  end
end
# {http:controls.classes.win32.server.sirius.org/}isChecked
#   arg0 - SOAP::SOAPLong
class IsChecked    
  attr_accessor :arg0

    def initialize(arg0 = nil)  @arg0 = arg0
  end
end
# {http:controls.classes.win32.server.sirius.org/}isCheckedResponse
#   m_return - SOAP::SOAPBoolean
class IsCheckedResponse  
    def m_return
  @v_return
  end

    def m_return=(value)  @v_return = value
  end

    def initialize(v_return = nil)  @v_return = v_return
  end
end
# {http:controls.classes.win32.server.sirius.org/}setCheck
#   arg0 - SOAP::SOAPLong
#   arg1 - SOAP::SOAPInt
class SetCheck    
  attr_accessor :arg0    
  attr_accessor :arg1

    def initialize(arg0 = nil, arg1 = nil)  @arg0 = arg0
    @arg1 = arg1
  end
end
# {http:controls.classes.win32.server.sirius.org/}setCheckResponse
class SetCheckResponse  
    def initialize
  end
end
# {http:controls.classes.win32.server.sirius.org/}isPushed
#   arg0 - SOAP::SOAPLong
class IsPushed    
  attr_accessor :arg0

    def initialize(arg0 = nil)  @arg0 = arg0
  end
end
# {http:controls.classes.win32.server.sirius.org/}isPushedResponse
#   m_return - SOAP::SOAPBoolean
class IsPushedResponse  
    def m_return
  @v_return
  end

    def m_return=(value)  @v_return = value
  end

    def initialize(v_return = nil)  @v_return = v_return
  end
end
# {http:controls.classes.win32.server.sirius.org/}setState
#   arg0 - SOAP::SOAPLong
#   arg1 - SOAP::SOAPInt
class SetState    
  attr_accessor :arg0    
  attr_accessor :arg1

    def initialize(arg0 = nil, arg1 = nil)  @arg0 = arg0
    @arg1 = arg1
  end
end
# {http:controls.classes.win32.server.sirius.org/}setStateResponse
class SetStateResponse  
    def initialize
  end
end
# {http:controls.classes.win32.server.sirius.org/}isIntermediate
#   arg0 - SOAP::SOAPLong
class IsIntermediate    
  attr_accessor :arg0

    def initialize(arg0 = nil)  @arg0 = arg0
  end
end
# {http:controls.classes.win32.server.sirius.org/}isIntermediateResponse
#   m_return - SOAP::SOAPBoolean
class IsIntermediateResponse  
    def m_return
  @v_return
  end

    def m_return=(value)  @v_return = value
  end

    def initialize(v_return = nil)  @v_return = v_return
  end
end
# {http:controls.classes.win32.server.sirius.org/}getCheck
#   arg0 - SOAP::SOAPLong
class GetCheck    
  attr_accessor :arg0

    def initialize(arg0 = nil)  @arg0 = arg0
  end
end
# {http:controls.classes.win32.server.sirius.org/}getCheckResponse
#   m_return - SOAP::SOAPInt
class GetCheckResponse  
    def m_return
  @v_return
  end

    def m_return=(value)  @v_return = value
  end

    def initialize(v_return = nil)  @v_return = v_return
  end
end

end; end; end; end; end
