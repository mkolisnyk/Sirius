module Sirius
  module Client
    module Web
      module Classes
        class WebEdit < WebControl
          attr_accessor :parent
          attr_accessor :parent_element
          attr_accessor :locator

          def initialize(parent, locator, parentElement = nil)
            @parent = parent
            @parent_element = parent_element
            @locator = locator
          end

          def type(content)
            client.core.sendKeys(@parent_element, @locator, content)
          end

          def text
            self.value
          end
        end
      end
    end
  end
end