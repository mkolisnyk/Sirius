module Sirius
  module Client
    module Win32
      module Classes
        class Window
          attr_accessor :client
          attr_accessor :locator
          attr_accessor :parent
          
          def initialize(locator,client=nil,parent=nil)
            @locator = locator
            @client = client
            @parent=parent

            if(parent != nil)
              @client = @parent.client
            end
          end

          def click
            return unless exists?
            @client.core.window.click(@locator.hwnd, 0, 0, 0, false, false, false);
          end

          def type_keys(text)
            return unless exists?
            text.split('//').each { |key|
              @client.core.window.keyPress(@locator.hwnd, key);
            }
          end

          def exists?
            if (@parent != nil)

              if (!@parent.exists?)
                return false;
              else
                @locator.parent = @parent.hwnd
              end
            end

            @locator.hwnd = 0
            if(@parent != nil)
              @client = @parent.client
            end

            @locator.hwnd = @client.utils.searchWindow(@locator)

            if @locator.hwnd != 0
              return true;
            else
              @locator.hwnd = 0
            end

            return false;
          end

=begin
          private Class<?>[] getArrayTypes(Object... params) {
            Class<?>[] types = new Class[params.length];
            for (int i = 0; i < params.length; i++) {
              types[i] = params[i].getClass();
            }
            return types;
          }

          public boolean waitFor(long timeout, String methodName,
              Object expectedValue, Object... params) throws Exception {
            long end = (new Date()).getTime() + timeout;
            Class<?>[] parameterTypes = getArrayTypes(params);
            while ((new Date()).getTime() < end) {
              Method waitMethod = this.getClass().getMethod(methodName,
                  parameterTypes);
              Object result = waitMethod.invoke(this, params);
              if (result.equals(expectedValue)) {
                return true;
              }
            }
            return false;
          }

          public boolean exists(long timeout) throws Exception {
            return waitFor(timeout, "exists", true);
          }
=end

          def disappears?
            !exists?
          end
=begin
          public boolean disappears(long timeout) throws Exception {
            return waitFor(timeout, "disappears", true);
          }
=end

          def get_client_rect
            @client.core.window.getClientRect(@locator.hwnd)
          end

          def get_rect
            @client.core.window.getRect(@locator.hwnd)
          end

          def enabled?
            @client.core.window.isEnabled(@locator.hwnd)
          end

          def visible?
            @client.core.window.isVisible(@locator.hwnd);
          end

        end
      end
    end
  end
end
