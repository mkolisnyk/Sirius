require 'EditService.rb'
require 'EditServiceMappingRegistry.rb'
require 'soap/rpc/driver'

module Sirius::Client::Win32::Core::Edit


class Edit < ::SOAP::RPC::Driver  DefaultEndpointUrl = "http:localhost:21212/win32/edit"
  Methods = [
    [ "",
      "emptyUndoBuffer",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "emptyUndoBuffer"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "emptyUndoBufferResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "getFirstVisibleLine",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "getFirstVisibleLine"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "getFirstVisibleLineResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "getPasswordChar",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "getPasswordChar"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "getPasswordCharResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "setPasswordChar",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "setPasswordChar"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "setPasswordCharResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "getSel",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "getSel"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "getSelResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "getModify",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "getModify"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "getModifyResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "lineFromChar",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "lineFromChar"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "lineFromCharResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "lineIndex",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "lineIndex"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "lineIndexResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "lineLength",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "lineLength"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "lineLengthResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "replaceSel",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "replaceSel"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "replaceSelResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "scrollCaret",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "scrollCaret"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "scrollCaretResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "setSel",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "setSel"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "setSelResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "getText",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "getText"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "getTextResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "setText",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "setText"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "setTextResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "undo",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "undo"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "undoResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "canUndo",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "canUndo"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "canUndoResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "getLineCount",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "getLineCount"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "getLineCountResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "scroll",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "scroll"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "scrollResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ]
  ]

    def initialize(endpoint_url = nil)  endpoint_url ||= DefaultEndpointUrl
    super(endpoint_url, nil)
    self.mapping_registry = EditServiceMappingRegistry::EncodedRegistry
    self.literal_mapping_registry = EditServiceMappingRegistry::LiteralRegistry
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
