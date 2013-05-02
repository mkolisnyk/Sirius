require 'sirius/win32/core/window/WindowService.rb'
require 'sirius/win32/core/window/WindowServiceMappingRegistry.rb'
require 'soap/rpc/driver'

module Sirius::Client::Win32::Core::Window


class Window < ::SOAP::RPC::Driver
  DefaultEndpointUrl = "http:localhost:21212/win32/window"
  Methods = [
    [ "",
      "getWindowPlacement",
      [ [SOAP::RPC::SOAPMethod::IN, "parameters", ["::SOAP::SOAPElement", "http://classes.win32.server.sirius.org/", "getWindowPlacement"]],
        [SOAP::RPC::SOAPMethod::OUT, "parameters", ["::SOAP::SOAPElement", "http://classes.win32.server.sirius.org/", "getWindowPlacementResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "getSystemMenu",
      [ [SOAP::RPC::SOAPMethod::IN, "parameters", ["::SOAP::SOAPElement", "http://classes.win32.server.sirius.org/", "getSystemMenu"]],
        [SOAP::RPC::SOAPMethod::OUT, "parameters", ["::SOAP::SOAPElement", "http://classes.win32.server.sirius.org/", "getSystemMenuResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "getClientRect",
      [ [SOAP::RPC::SOAPMethod::IN, "parameters", ["::SOAP::SOAPElement", "http://classes.win32.server.sirius.org/", "getClientRect"]],
        [SOAP::RPC::SOAPMethod::OUT, "parameters", ["::SOAP::SOAPElement", "http://classes.win32.server.sirius.org/", "getClientRectResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "doubleClick",
      [ [SOAP::RPC::SOAPMethod::IN, "parameters", ["::SOAP::SOAPElement", "http://classes.win32.server.sirius.org/", "doubleClick"]],
        [SOAP::RPC::SOAPMethod::OUT, "parameters", ["::SOAP::SOAPElement", "http://classes.win32.server.sirius.org/", "doubleClickResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "keyPress",
      [ [SOAP::RPC::SOAPMethod::IN, "parameters", ["::SOAP::SOAPElement", "http://classes.win32.server.sirius.org/", "keyPress"]],
        [SOAP::RPC::SOAPMethod::OUT, "parameters", ["::SOAP::SOAPElement", "http://classes.win32.server.sirius.org/", "keyPressResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "getRect",
      [ [SOAP::RPC::SOAPMethod::IN, "parameters", ["::SOAP::SOAPElement", "http://classes.win32.server.sirius.org/", "getRect"]],
        [SOAP::RPC::SOAPMethod::OUT, "parameters", ["::SOAP::SOAPElement", "http://classes.win32.server.sirius.org/", "getRectResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "isMaximized",
      [ [SOAP::RPC::SOAPMethod::IN, "parameters", ["::SOAP::SOAPElement", "http://classes.win32.server.sirius.org/", "isMaximized"]],
        [SOAP::RPC::SOAPMethod::OUT, "parameters", ["::SOAP::SOAPElement", "http://classes.win32.server.sirius.org/", "isMaximizedResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "isMinimized",
      [ [SOAP::RPC::SOAPMethod::IN, "parameters", ["::SOAP::SOAPElement", "http://classes.win32.server.sirius.org/", "isMinimized"]],
        [SOAP::RPC::SOAPMethod::OUT, "parameters", ["::SOAP::SOAPElement", "http://classes.win32.server.sirius.org/", "isMinimizedResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "isUnicode",
      [ [SOAP::RPC::SOAPMethod::IN, "parameters", ["::SOAP::SOAPElement", "http://classes.win32.server.sirius.org/", "isUnicode"]],
        [SOAP::RPC::SOAPMethod::OUT, "parameters", ["::SOAP::SOAPElement", "http://classes.win32.server.sirius.org/", "isUnicodeResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "isWindow",
      [ [SOAP::RPC::SOAPMethod::IN, "parameters", ["::SOAP::SOAPElement", "http://classes.win32.server.sirius.org/", "isWindow"]],
        [SOAP::RPC::SOAPMethod::OUT, "parameters", ["::SOAP::SOAPElement", "http://classes.win32.server.sirius.org/", "isWindowResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "sizeTo",
      [ [SOAP::RPC::SOAPMethod::IN, "parameters", ["::SOAP::SOAPElement", "http://classes.win32.server.sirius.org/", "sizeTo"]],
        [SOAP::RPC::SOAPMethod::OUT, "parameters", ["::SOAP::SOAPElement", "http://classes.win32.server.sirius.org/", "sizeToResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "start",
      [ [SOAP::RPC::SOAPMethod::IN, "parameters", ["::SOAP::SOAPElement", "http://classes.win32.server.sirius.org/", "start"]],
        [SOAP::RPC::SOAPMethod::OUT, "parameters", ["::SOAP::SOAPElement", "http://classes.win32.server.sirius.org/", "startResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "close",
      [ [SOAP::RPC::SOAPMethod::IN, "parameters", ["::SOAP::SOAPElement", "http://classes.win32.server.sirius.org/", "close"]],
        [SOAP::RPC::SOAPMethod::OUT, "parameters", ["::SOAP::SOAPElement", "http://classes.win32.server.sirius.org/", "closeResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "isVisible",
      [ [SOAP::RPC::SOAPMethod::IN, "parameters", ["::SOAP::SOAPElement", "http://classes.win32.server.sirius.org/", "isVisible"]],
        [SOAP::RPC::SOAPMethod::OUT, "parameters", ["::SOAP::SOAPElement", "http://classes.win32.server.sirius.org/", "isVisibleResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "isEnabled",
      [ [SOAP::RPC::SOAPMethod::IN, "parameters", ["::SOAP::SOAPElement", "http://classes.win32.server.sirius.org/", "isEnabled"]],
        [SOAP::RPC::SOAPMethod::OUT, "parameters", ["::SOAP::SOAPElement", "http://classes.win32.server.sirius.org/", "isEnabledResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "keyDown",
      [ [SOAP::RPC::SOAPMethod::IN, "parameters", ["::SOAP::SOAPElement", "http://classes.win32.server.sirius.org/", "keyDown"]],
        [SOAP::RPC::SOAPMethod::OUT, "parameters", ["::SOAP::SOAPElement", "http://classes.win32.server.sirius.org/", "keyDownResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "keyUp",
      [ [SOAP::RPC::SOAPMethod::IN, "parameters", ["::SOAP::SOAPElement", "http://classes.win32.server.sirius.org/", "keyUp"]],
        [SOAP::RPC::SOAPMethod::OUT, "parameters", ["::SOAP::SOAPElement", "http://classes.win32.server.sirius.org/", "keyUpResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "mouseDown",
      [ [SOAP::RPC::SOAPMethod::IN, "parameters", ["::SOAP::SOAPElement", "http://classes.win32.server.sirius.org/", "mouseDown"]],
        [SOAP::RPC::SOAPMethod::OUT, "parameters", ["::SOAP::SOAPElement", "http://classes.win32.server.sirius.org/", "mouseDownResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "mouseUp",
      [ [SOAP::RPC::SOAPMethod::IN, "parameters", ["::SOAP::SOAPElement", "http://classes.win32.server.sirius.org/", "mouseUp"]],
        [SOAP::RPC::SOAPMethod::OUT, "parameters", ["::SOAP::SOAPElement", "http://classes.win32.server.sirius.org/", "mouseUpResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "move",
      [ [SOAP::RPC::SOAPMethod::IN, "parameters", ["::SOAP::SOAPElement", "http://classes.win32.server.sirius.org/", "move"]],
        [SOAP::RPC::SOAPMethod::OUT, "parameters", ["::SOAP::SOAPElement", "http://classes.win32.server.sirius.org/", "moveResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "getText",
      [ [SOAP::RPC::SOAPMethod::IN, "parameters", ["::SOAP::SOAPElement", "http://classes.win32.server.sirius.org/", "getText"]],
        [SOAP::RPC::SOAPMethod::OUT, "parameters", ["::SOAP::SOAPElement", "http://classes.win32.server.sirius.org/", "getTextResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "activate",
      [ [SOAP::RPC::SOAPMethod::IN, "parameters", ["::SOAP::SOAPElement", "http://classes.win32.server.sirius.org/", "activate"]],
        [SOAP::RPC::SOAPMethod::OUT, "parameters", ["::SOAP::SOAPElement", "http://classes.win32.server.sirius.org/", "activateResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "moveTo",
      [ [SOAP::RPC::SOAPMethod::IN, "parameters", ["::SOAP::SOAPElement", "http://classes.win32.server.sirius.org/", "moveTo"]],
        [SOAP::RPC::SOAPMethod::OUT, "parameters", ["::SOAP::SOAPElement", "http://classes.win32.server.sirius.org/", "moveToResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "maximize",
      [ [SOAP::RPC::SOAPMethod::IN, "parameters", ["::SOAP::SOAPElement", "http://classes.win32.server.sirius.org/", "maximize"]],
        [SOAP::RPC::SOAPMethod::OUT, "parameters", ["::SOAP::SOAPElement", "http://classes.win32.server.sirius.org/", "maximizeResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "minimize",
      [ [SOAP::RPC::SOAPMethod::IN, "parameters", ["::SOAP::SOAPElement", "http://classes.win32.server.sirius.org/", "minimize"]],
        [SOAP::RPC::SOAPMethod::OUT, "parameters", ["::SOAP::SOAPElement", "http://classes.win32.server.sirius.org/", "minimizeResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "restore",
      [ [SOAP::RPC::SOAPMethod::IN, "parameters", ["::SOAP::SOAPElement", "http://classes.win32.server.sirius.org/", "restore"]],
        [SOAP::RPC::SOAPMethod::OUT, "parameters", ["::SOAP::SOAPElement", "http://classes.win32.server.sirius.org/", "restoreResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "click",
      [ [SOAP::RPC::SOAPMethod::IN, "parameters", ["::SOAP::SOAPElement", "http://classes.win32.server.sirius.org/", "click"]],
        [SOAP::RPC::SOAPMethod::OUT, "parameters", ["::SOAP::SOAPElement", "http://classes.win32.server.sirius.org/", "clickResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "getMenu",
      [ [SOAP::RPC::SOAPMethod::IN, "parameters", ["::SOAP::SOAPElement", "http://classes.win32.server.sirius.org/", "getMenu"]],
        [SOAP::RPC::SOAPMethod::OUT, "parameters", ["::SOAP::SOAPElement", "http://classes.win32.server.sirius.org/", "getMenuResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "isNormal",
      [ [SOAP::RPC::SOAPMethod::IN, "parameters", ["::SOAP::SOAPElement", "http://classes.win32.server.sirius.org/", "isNormal"]],
        [SOAP::RPC::SOAPMethod::OUT, "parameters", ["::SOAP::SOAPElement", "http://classes.win32.server.sirius.org/", "isNormalResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ]
  ]

    def initialize(endpoint_url = nil)  endpoint_url ||= DefaultEndpointUrl
    super(endpoint_url, nil)
    self.mapping_registry = WindowServiceMappingRegistry::EncodedRegistry
    self.literal_mapping_registry = WindowServiceMappingRegistry::LiteralRegistry
    init_methods
  end
private

    def init_methods
      Methods.each do |definitions|
              opt = definitions.last
              if opt[:request_style] == :document
                add_document_operation(*definitions)
              else
                add_rpc_operation(*definitions)
                qname = definitions[0]
                name = definitions[2]
                if qname.name != name and qname.name.capitalize == name.capitalize
                  ::SOAP::Mapping.define_singleton_method(self, qname.name) do |*arg|
                    __send__(name, *arg)
                  end
                end
              end
            end

  end
end

end
