require 'sirius/win32/core/menu/MenuService.rb'
require 'sirius/win32/core/menu/MenuServiceMappingRegistry.rb'
require 'soap/rpc/driver'

module Sirius::Client::Win32::Core::Menu


class Menu < ::SOAP::RPC::Driver
  DefaultEndpointUrl = "http:localhost:21212/win32/menu"
  Methods = [
    [ "",
      "isMenu",
      [ [SOAP::RPC::SOAPMethod::IN, "parameters", ["::SOAP::SOAPElement", "http://classes.win32.server.sirius.org/", "IsMenu"]],
        [SOAP::RPC::SOAPMethod::OUT, "parameters", ["::SOAP::SOAPElement", "http://classes.win32.server.sirius.org/", "IsMenuResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "getMenuInfo",
      [ [SOAP::RPC::SOAPMethod::IN, "parameters", ["::SOAP::SOAPElement", "http://classes.win32.server.sirius.org/", "GetMenuInfo"]],
        [SOAP::RPC::SOAPMethod::OUT, "parameters", ["::SOAP::SOAPElement", "http://classes.win32.server.sirius.org/", "GetMenuInfoResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "getMenuState",
      [ [SOAP::RPC::SOAPMethod::IN, "parameters", ["::SOAP::SOAPElement", "http://classes.win32.server.sirius.org/", "GetMenuState"]],
        [SOAP::RPC::SOAPMethod::OUT, "parameters", ["::SOAP::SOAPElement", "http://classes.win32.server.sirius.org/", "GetMenuStateResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "getSubMenu",
      [ [SOAP::RPC::SOAPMethod::IN, "parameters", ["::SOAP::SOAPElement", "http://classes.win32.server.sirius.org/", "GetSubMenu"]],
        [SOAP::RPC::SOAPMethod::OUT, "parameters", ["::SOAP::SOAPElement", "http://classes.win32.server.sirius.org/", "GetSubMenuResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "getMenuItemRect",
      [ [SOAP::RPC::SOAPMethod::IN, "parameters", ["::SOAP::SOAPElement", "http://classes.win32.server.sirius.org/", "GetMenuItemRect"]],
        [SOAP::RPC::SOAPMethod::OUT, "parameters", ["::SOAP::SOAPElement", "http://classes.win32.server.sirius.org/", "GetMenuItemRectResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "getMenuDefaultItem",
      [ [SOAP::RPC::SOAPMethod::IN, "parameters", ["::SOAP::SOAPElement", "http://classes.win32.server.sirius.org/", "GetMenuDefaultItem"]],
        [SOAP::RPC::SOAPMethod::OUT, "parameters", ["::SOAP::SOAPElement", "http://classes.win32.server.sirius.org/", "GetMenuDefaultItemResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "getMenuItemCount",
      [ [SOAP::RPC::SOAPMethod::IN, "parameters", ["::SOAP::SOAPElement", "http://classes.win32.server.sirius.org/", "GetMenuItemCount"]],
        [SOAP::RPC::SOAPMethod::OUT, "parameters", ["::SOAP::SOAPElement", "http://classes.win32.server.sirius.org/", "GetMenuItemCountResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "getMenuItemID",
      [ [SOAP::RPC::SOAPMethod::IN, "parameters", ["::SOAP::SOAPElement", "http://classes.win32.server.sirius.org/", "GetMenuItemID"]],
        [SOAP::RPC::SOAPMethod::OUT, "parameters", ["::SOAP::SOAPElement", "http://classes.win32.server.sirius.org/", "GetMenuItemIDResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "getMenuItemInfo",
      [ [SOAP::RPC::SOAPMethod::IN, "parameters", ["::SOAP::SOAPElement", "http://classes.win32.server.sirius.org/", "GetMenuItemInfo"]],
        [SOAP::RPC::SOAPMethod::OUT, "parameters", ["::SOAP::SOAPElement", "http://classes.win32.server.sirius.org/", "GetMenuItemInfoResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "getMenuString",
      [ [SOAP::RPC::SOAPMethod::IN, "parameters", ["::SOAP::SOAPElement", "http://classes.win32.server.sirius.org/", "GetMenuString"]],
        [SOAP::RPC::SOAPMethod::OUT, "parameters", ["::SOAP::SOAPElement", "http://classes.win32.server.sirius.org/", "GetMenuStringResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "pickItem",
      [ [SOAP::RPC::SOAPMethod::IN, "parameters", ["::SOAP::SOAPElement", "http://classes.win32.server.sirius.org/", "pickItem"]],
        [SOAP::RPC::SOAPMethod::OUT, "parameters", ["::SOAP::SOAPElement", "http://classes.win32.server.sirius.org/", "pickItemResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ]
  ]

    def initialize(endpoint_url = nil)  endpoint_url ||= DefaultEndpointUrl
    super(endpoint_url, nil)
    self.mapping_registry = MenuServiceMappingRegistry::EncodedRegistry
    self.literal_mapping_registry = MenuServiceMappingRegistry::LiteralRegistry
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
