@if "%DEBUG%" == "" @echo off
@rem ##########################################################################
@rem
@rem  test startup script for Windows
@rem
@rem ##########################################################################

@rem Set local scope for the variables with windows NT shell
if "%OS%"=="Windows_NT" setlocal

set DIRNAME=%~dp0
if "%DIRNAME%" == "" set DIRNAME=.
set APP_BASE_NAME=%~n0
set APP_HOME=%DIRNAME%..

@rem Add default JVM options here. You can also use JAVA_OPTS and TEST_OPTS to pass JVM options to this script.
set DEFAULT_JVM_OPTS=

@rem Find java.exe
if defined JAVA_HOME goto findJavaFromJavaHome

set JAVA_EXE=java.exe
%JAVA_EXE% -version >NUL 2>&1
if "%ERRORLEVEL%" == "0" goto init

echo.
echo ERROR: JAVA_HOME is not set and no 'java' command could be found in your PATH.
echo.
echo Please set the JAVA_HOME variable in your environment to match the
echo location of your Java installation.

goto fail

:findJavaFromJavaHome
set JAVA_HOME=%JAVA_HOME:"=%
set JAVA_EXE=%JAVA_HOME%/bin/java.exe

if exist "%JAVA_EXE%" goto init

echo.
echo ERROR: JAVA_HOME is set to an invalid directory: %JAVA_HOME%
echo.
echo Please set the JAVA_HOME variable in your environment to match the
echo location of your Java installation.

goto fail

:init
@rem Get command-line arguments, handling Windows variants

if not "%OS%" == "Windows_NT" goto win9xME_args

:win9xME_args
@rem Slurp the command line arguments.
set CMD_LINE_ARGS=
set _SKIP=2

:win9xME_args_slurp
if "x%~1" == "x" goto execute

set CMD_LINE_ARGS=%*

:execute
@rem Setup the command line

set CLASSPATH=%APP_HOME%\lib\test.jar;%APP_HOME%\lib\slf4j-api-1.7.21.jar;%APP_HOME%\lib\mybatis-spring-1.2.2.jar;%APP_HOME%\lib\mybatis-3.2.8.jar;%APP_HOME%\lib\commons-logging-1.2.jar;%APP_HOME%\lib\javax.servlet-api-3.1.0.jar;%APP_HOME%\lib\commons-lang3-3.4.jar;%APP_HOME%\lib\spring-ldap-core-1.3.1.RELEASE.jar;%APP_HOME%\lib\spring-security-web-4.1.0.RELEASE.jar;%APP_HOME%\lib\spring-security-config-4.1.0.RELEASE.jar;%APP_HOME%\lib\spring-jdbc-4.2.6.RELEASE.jar;%APP_HOME%\lib\spring-aspects-4.2.6.RELEASE.jar;%APP_HOME%\lib\spring-webmvc-4.2.6.RELEASE.jar;%APP_HOME%\lib\json-lib-2.4-jdk15.jar;%APP_HOME%\lib\spring-context-support-4.2.6.RELEASE.jar;%APP_HOME%\lib\jta-1.1.jar;%APP_HOME%\lib\commons-fileupload-1.2.2.jar;%APP_HOME%\lib\persistence-api-1.0.2.jar;%APP_HOME%\lib\jackson-annotations-2.5.1.jar;%APP_HOME%\lib\jackson-core-2.5.1.jar;%APP_HOME%\lib\jackson-databind-2.0.5.jar;%APP_HOME%\lib\ehcache-spring-annotations-1.2.0.jar;%APP_HOME%\lib\postgresql-9.0-801.jdbc4.jar;%APP_HOME%\lib\commons-lang-2.5.jar;%APP_HOME%\lib\aopalliance-1.0.jar;%APP_HOME%\lib\spring-security-core-4.1.0.RELEASE.jar;%APP_HOME%\lib\aspectjweaver-1.8.9.jar;%APP_HOME%\lib\commons-beanutils-1.8.0.jar;%APP_HOME%\lib\commons-collections-3.2.1.jar;%APP_HOME%\lib\ezmorph-1.0.6.jar;%APP_HOME%\lib\atomikos-util-3.6.4.jar;%APP_HOME%\lib\transactions-api-3.6.4.jar;%APP_HOME%\lib\transactions-jdbc-deprecated-3.6.4.jar;%APP_HOME%\lib\transactions-jdbc-3.6.4.jar;%APP_HOME%\lib\transactions-jms-deprecated-3.6.4.jar;%APP_HOME%\lib\transactions-jms-3.6.4.jar;%APP_HOME%\lib\transactions-jta-3.6.4.jar;%APP_HOME%\lib\transactions-3.6.4.jar;%APP_HOME%\lib\transactions-hibernate3-3.6.4.jar;%APP_HOME%\lib\guava-r09.jar;%APP_HOME%\lib\ehcache-core-2.4.5.jar;%APP_HOME%\lib\geronimo-jta_1.0.1B_spec-1.0.1.jar;%APP_HOME%\lib\jms-1.1.jar;%APP_HOME%\lib\hibernate-3.2.5.ga.jar;%APP_HOME%\lib\ehcache-1.2.3.jar;%APP_HOME%\lib\asm-attrs-1.5.3.jar;%APP_HOME%\lib\dom4j-1.6.1.jar;%APP_HOME%\lib\antlr-2.7.6.jar;%APP_HOME%\lib\cglib-2.1_3.jar;%APP_HOME%\lib\asm-1.5.3.jar;%APP_HOME%\lib\spring-beans-4.2.6.RELEASE.jar;%APP_HOME%\lib\spring-core-4.2.6.RELEASE.jar;%APP_HOME%\lib\spring-tx-4.2.6.RELEASE.jar;%APP_HOME%\lib\spring-context-4.2.6.RELEASE.jar;%APP_HOME%\lib\spring-expression-4.2.6.RELEASE.jar;%APP_HOME%\lib\spring-web-4.2.6.RELEASE.jar;%APP_HOME%\lib\spring-aop-4.2.6.RELEASE.jar

@rem Execute test
"%JAVA_EXE%" %DEFAULT_JVM_OPTS% %JAVA_OPTS% %TEST_OPTS%  -classpath "%CLASSPATH%" com.good.Application %CMD_LINE_ARGS%

:end
@rem End local scope for the variables with windows NT shell
if "%ERRORLEVEL%"=="0" goto mainEnd

:fail
rem Set variable TEST_EXIT_CONSOLE if you need the _script_ return code instead of
rem the _cmd.exe /c_ return code!
if  not "" == "%TEST_EXIT_CONSOLE%" exit 1
exit /b 1

:mainEnd
if "%OS%"=="Windows_NT" endlocal

:omega
