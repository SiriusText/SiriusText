package org.obeonetwork.sirius.text.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSiriusTextDslLexer extends Lexer {
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int RULE_INT=8;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__99=99;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__10=10;
    public static final int T__98=98;
    public static final int RULE_DOCUMENTATION=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=6;
    public static final int RULE_EXPRESSION=7;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=9;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;

    // delegates
    // delegators

    public InternalSiriusTextDslLexer() {;} 
    public InternalSiriusTextDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalSiriusTextDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalSiriusTextDsl.g"; }

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:11:7: ( 'package' )
            // InternalSiriusTextDsl.g:11:9: 'package'
            {
            match("package"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:12:7: ( '.' )
            // InternalSiriusTextDsl.g:12:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:13:7: ( '.*' )
            // InternalSiriusTextDsl.g:13:9: '.*'
            {
            match(".*"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:14:7: ( 'import' )
            // InternalSiriusTextDsl.g:14:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:15:7: ( 'designer' )
            // InternalSiriusTextDsl.g:15:9: 'designer'
            {
            match("designer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:16:7: ( 'as' )
            // InternalSiriusTextDsl.g:16:9: 'as'
            {
            match("as"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:17:7: ( '{' )
            // InternalSiriusTextDsl.g:17:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:18:7: ( '}' )
            // InternalSiriusTextDsl.g:18:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:19:7: ( 'viewpoint' )
            // InternalSiriusTextDsl.g:19:9: 'viewpoint'
            {
            match("viewpoint"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:20:7: ( 'modelFileExtensions' )
            // InternalSiriusTextDsl.g:20:9: 'modelFileExtensions'
            {
            match("modelFileExtensions"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:21:7: ( '=' )
            // InternalSiriusTextDsl.g:21:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:22:7: ( '[' )
            // InternalSiriusTextDsl.g:22:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:23:7: ( ',' )
            // InternalSiriusTextDsl.g:23:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:24:7: ( ']' )
            // InternalSiriusTextDsl.g:24:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:25:7: ( 'icon' )
            // InternalSiriusTextDsl.g:25:9: 'icon'
            {
            match("icon"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:26:7: ( 'representations' )
            // InternalSiriusTextDsl.g:26:9: 'representations'
            {
            match("representations"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:27:7: ( '@Initialized' )
            // InternalSiriusTextDsl.g:27:9: '@Initialized'
            {
            match("@Initialized"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:28:7: ( '@ShowOnStartup' )
            // InternalSiriusTextDsl.g:28:9: '@ShowOnStartup'
            {
            match("@ShowOnStartup"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:29:7: ( '@EnablePopupBars' )
            // InternalSiriusTextDsl.g:29:9: '@EnablePopupBars'
            {
            match("@EnablePopupBars"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:30:7: ( '@MetamodelUris' )
            // InternalSiriusTextDsl.g:30:9: '@MetamodelUris'
            {
            match("@MetamodelUris"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:31:7: ( '({' )
            // InternalSiriusTextDsl.g:31:9: '({'
            {
            match("({"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:32:7: ( '})' )
            // InternalSiriusTextDsl.g:32:9: '})'
            {
            match("})"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:33:7: ( 'diagram' )
            // InternalSiriusTextDsl.g:33:9: 'diagram'
            {
            match("diagram"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:34:7: ( 'for' )
            // InternalSiriusTextDsl.g:34:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:35:7: ( '?' )
            // InternalSiriusTextDsl.g:35:9: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:36:7: ( 'documentation' )
            // InternalSiriusTextDsl.g:36:9: 'documentation'
            {
            match("documentation"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:37:7: ( 'titleExpression' )
            // InternalSiriusTextDsl.g:37:9: 'titleExpression'
            {
            match("titleExpression"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:38:7: ( 'rootExpression' )
            // InternalSiriusTextDsl.g:38:9: 'rootExpression'
            {
            match("rootExpression"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:39:7: ( 'defaultLayer' )
            // InternalSiriusTextDsl.g:39:9: 'defaultLayer'
            {
            match("defaultLayer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:40:7: ( 'additionalLayers' )
            // InternalSiriusTextDsl.g:40:9: 'additionalLayers'
            {
            match("additionalLayers"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:41:7: ( 'layer' )
            // InternalSiriusTextDsl.g:41:9: 'layer'
            {
            match("layer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:42:7: ( 'mappings' )
            // InternalSiriusTextDsl.g:42:9: 'mappings'
            {
            match("mappings"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:43:7: ( 'edges' )
            // InternalSiriusTextDsl.g:43:9: 'edges'
            {
            match("edges"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:44:7: ( 'list' )
            // InternalSiriusTextDsl.g:44:9: 'list'
            {
            match("list"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:45:7: ( 'container' )
            // InternalSiriusTextDsl.g:45:9: 'container'
            {
            match("container"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:46:7: ( 'style' )
            // InternalSiriusTextDsl.g:46:9: 'style'
            {
            match("style"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:47:7: ( 'semanticCandidatesExpression' )
            // InternalSiriusTextDsl.g:47:9: 'semanticCandidatesExpression'
            {
            match("semanticCandidatesExpression"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:48:7: ( 'if' )
            // InternalSiriusTextDsl.g:48:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:49:7: ( 'gradient' )
            // InternalSiriusTextDsl.g:49:9: 'gradient'
            {
            match("gradient"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:50:7: ( 'from' )
            // InternalSiriusTextDsl.g:50:9: 'from'
            {
            match("from"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:51:7: ( 'to' )
            // InternalSiriusTextDsl.g:51:9: 'to'
            {
            match("to"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:52:7: ( 'label' )
            // InternalSiriusTextDsl.g:52:9: 'label'
            {
            match("label"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:53:7: ( 'in' )
            // InternalSiriusTextDsl.g:53:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:54:7: ( 'border' )
            // InternalSiriusTextDsl.g:54:9: 'border'
            {
            match("border"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:55:7: ( 'size' )
            // InternalSiriusTextDsl.g:55:9: 'size'
            {
            match("size"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:56:7: ( 'heightComputationExpression' )
            // InternalSiriusTextDsl.g:56:9: 'heightComputationExpression'
            {
            match("heightComputationExpression"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:57:7: ( 'widthComputationExpression' )
            // InternalSiriusTextDsl.g:57:9: 'widthComputationExpression'
            {
            match("widthComputationExpression"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:58:7: ( 'relationBasedEdge' )
            // InternalSiriusTextDsl.g:58:9: 'relationBasedEdge'
            {
            match("relationBasedEdge"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:59:7: ( 'sourceMappings' )
            // InternalSiriusTextDsl.g:59:9: 'sourceMappings'
            {
            match("sourceMappings"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:60:7: ( 'targetMappings' )
            // InternalSiriusTextDsl.g:60:9: 'targetMappings'
            {
            match("targetMappings"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:61:7: ( 'targetFileExpression' )
            // InternalSiriusTextDsl.g:61:9: 'targetFileExpression'
            {
            match("targetFileExpression"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:62:7: ( 'edgeStyle' )
            // InternalSiriusTextDsl.g:62:9: 'edgeStyle'
            {
            match("edgeStyle"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:63:7: ( 'line' )
            // InternalSiriusTextDsl.g:63:9: 'line'
            {
            match("line"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:64:7: ( 'routing' )
            // InternalSiriusTextDsl.g:64:9: 'routing'
            {
            match("routing"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:65:7: ( 'sourceArrow' )
            // InternalSiriusTextDsl.g:65:9: 'sourceArrow'
            {
            match("sourceArrow"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:66:7: ( 'targetArrow' )
            // InternalSiriusTextDsl.g:66:9: 'targetArrow'
            {
            match("targetArrow"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:67:7: ( 'sizeComputationExpression' )
            // InternalSiriusTextDsl.g:67:9: 'sizeComputationExpression'
            {
            match("sizeComputationExpression"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:68:7: ( 'foldingStyle' )
            // InternalSiriusTextDsl.g:68:9: 'foldingStyle'
            {
            match("foldingStyle"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:69:7: ( 'endsCentering' )
            // InternalSiriusTextDsl.g:69:9: 'endsCentering'
            {
            match("endsCentering"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:70:7: ( 'palette' )
            // InternalSiriusTextDsl.g:70:9: 'palette'
            {
            match("palette"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:71:7: ( 'color' )
            // InternalSiriusTextDsl.g:71:9: 'color'
            {
            match("color"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:72:7: ( 'rgb(' )
            // InternalSiriusTextDsl.g:72:9: 'rgb('
            {
            match("rgb("); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:73:7: ( ')' )
            // InternalSiriusTextDsl.g:73:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:74:7: ( 'left' )
            // InternalSiriusTextDsl.g:74:9: 'left'
            {
            match("left"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:75:7: ( 'center' )
            // InternalSiriusTextDsl.g:75:9: 'center'
            {
            match("center"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:76:7: ( 'right' )
            // InternalSiriusTextDsl.g:76:9: 'right'
            {
            match("right"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:77:7: ( 'oblique' )
            // InternalSiriusTextDsl.g:77:9: 'oblique'
            {
            match("oblique"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:78:7: ( 'lefttoright' )
            // InternalSiriusTextDsl.g:78:9: 'lefttoright'
            {
            match("lefttoright"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:79:7: ( 'toptobottom' )
            // InternalSiriusTextDsl.g:79:9: 'toptobottom'
            {
            match("toptobottom"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:80:7: ( 'solid' )
            // InternalSiriusTextDsl.g:80:9: 'solid'
            {
            match("solid"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:81:7: ( 'dash' )
            // InternalSiriusTextDsl.g:81:9: 'dash'
            {
            match("dash"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:82:7: ( 'dot' )
            // InternalSiriusTextDsl.g:82:9: 'dot'
            {
            match("dot"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:83:7: ( 'dash_dot' )
            // InternalSiriusTextDsl.g:83:9: 'dash_dot'
            {
            match("dash_dot"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:84:7: ( 'straight' )
            // InternalSiriusTextDsl.g:84:9: 'straight'
            {
            match("straight"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:85:7: ( 'manhattan' )
            // InternalSiriusTextDsl.g:85:9: 'manhattan'
            {
            match("manhattan"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:86:7: ( 'tree' )
            // InternalSiriusTextDsl.g:86:9: 'tree'
            {
            match("tree"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:87:7: ( 'NoDecoration' )
            // InternalSiriusTextDsl.g:87:9: 'NoDecoration'
            {
            match("NoDecoration"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:88:7: ( 'OutputArrow' )
            // InternalSiriusTextDsl.g:88:9: 'OutputArrow'
            {
            match("OutputArrow"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:89:7: ( 'InputArrow' )
            // InternalSiriusTextDsl.g:89:9: 'InputArrow'
            {
            match("InputArrow"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:90:7: ( 'OutputClosedArrow' )
            // InternalSiriusTextDsl.g:90:9: 'OutputClosedArrow'
            {
            match("OutputClosedArrow"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:91:7: ( 'InputClosedArrow' )
            // InternalSiriusTextDsl.g:91:9: 'InputClosedArrow'
            {
            match("InputClosedArrow"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:92:7: ( 'OutputFillClosedArrow' )
            // InternalSiriusTextDsl.g:92:9: 'OutputFillClosedArrow'
            {
            match("OutputFillClosedArrow"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:93:7: ( 'InputFillClosedArrow' )
            // InternalSiriusTextDsl.g:93:9: 'InputFillClosedArrow'
            {
            match("InputFillClosedArrow"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:94:7: ( 'Diamond' )
            // InternalSiriusTextDsl.g:94:9: 'Diamond'
            {
            match("Diamond"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:95:7: ( 'FillDiamond' )
            // InternalSiriusTextDsl.g:95:9: 'FillDiamond'
            {
            match("FillDiamond"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:96:7: ( 'InputArrowWithDiamond' )
            // InternalSiriusTextDsl.g:96:9: 'InputArrowWithDiamond'
            {
            match("InputArrowWithDiamond"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:97:7: ( 'InputArrowWithFillDiamond' )
            // InternalSiriusTextDsl.g:97:9: 'InputArrowWithFillDiamond'
            {
            match("InputArrowWithFillDiamond"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:98:7: ( 'none' )
            // InternalSiriusTextDsl.g:98:9: 'none'
            {
            match("none"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:99:7: ( 'source' )
            // InternalSiriusTextDsl.g:99:9: 'source'
            {
            match("source"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:100:7: ( 'target' )
            // InternalSiriusTextDsl.g:100:9: 'target'
            {
            match("target"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "T__100"
    public final void mT__100() throws RecognitionException {
        try {
            int _type = T__100;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:101:8: ( 'both' )
            // InternalSiriusTextDsl.g:101:10: 'both'
            {
            match("both"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__100"

    // $ANTLR start "RULE_DOCUMENTATION"
    public final void mRULE_DOCUMENTATION() throws RecognitionException {
        try {
            int _type = RULE_DOCUMENTATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:3028:20: ( '/**' ( options {greedy=false; } : . )* '*/' )
            // InternalSiriusTextDsl.g:3028:22: '/**' ( options {greedy=false; } : . )* '*/'
            {
            match("/**"); 

            // InternalSiriusTextDsl.g:3028:28: ( options {greedy=false; } : . )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='*') ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1=='/') ) {
                        alt1=2;
                    }
                    else if ( ((LA1_1>='\u0000' && LA1_1<='.')||(LA1_1>='0' && LA1_1<='\uFFFF')) ) {
                        alt1=1;
                    }


                }
                else if ( ((LA1_0>='\u0000' && LA1_0<=')')||(LA1_0>='+' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSiriusTextDsl.g:3028:56: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOCUMENTATION"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:3030:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalSiriusTextDsl.g:3030:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalSiriusTextDsl.g:3030:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalSiriusTextDsl.g:3030:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalSiriusTextDsl.g:3030:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSiriusTextDsl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:3032:10: ( ( '0' .. '9' )+ )
            // InternalSiriusTextDsl.g:3032:12: ( '0' .. '9' )+
            {
            // InternalSiriusTextDsl.g:3032:12: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSiriusTextDsl.g:3032:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:3034:13: ( '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            // InternalSiriusTextDsl.g:3034:15: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
            {
            match('\''); 
            // InternalSiriusTextDsl.g:3034:20: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
            loop5:
            do {
                int alt5=3;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='\\') ) {
                    alt5=1;
                }
                else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                    alt5=2;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSiriusTextDsl.g:3034:21: '\\\\' .
            	    {
            	    match('\\'); 
            	    matchAny(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalSiriusTextDsl.g:3034:28: ~ ( ( '\\\\' | '\\'' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_EXPRESSION"
    public final void mRULE_EXPRESSION() throws RecognitionException {
        try {
            int _type = RULE_EXPRESSION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:3036:17: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // InternalSiriusTextDsl.g:3036:19: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // InternalSiriusTextDsl.g:3036:23: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
            loop6:
            do {
                int alt6=3;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='\\') ) {
                    alt6=1;
                }
                else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                    alt6=2;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSiriusTextDsl.g:3036:24: '\\\\' .
            	    {
            	    match('\\'); 
            	    matchAny(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalSiriusTextDsl.g:3036:31: ~ ( ( '\\\\' | '\"' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXPRESSION"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSiriusTextDsl.g:3038:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalSiriusTextDsl.g:3038:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalSiriusTextDsl.g:3038:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='\t' && LA7_0<='\n')||LA7_0=='\r'||LA7_0==' ') ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSiriusTextDsl.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    public void mTokens() throws RecognitionException {
        // InternalSiriusTextDsl.g:1:8: ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | RULE_DOCUMENTATION | RULE_ID | RULE_INT | RULE_STRING | RULE_EXPRESSION | RULE_WS )
        int alt8=97;
        alt8 = dfa8.predict(input);
        switch (alt8) {
            case 1 :
                // InternalSiriusTextDsl.g:1:10: T__10
                {
                mT__10(); 

                }
                break;
            case 2 :
                // InternalSiriusTextDsl.g:1:16: T__11
                {
                mT__11(); 

                }
                break;
            case 3 :
                // InternalSiriusTextDsl.g:1:22: T__12
                {
                mT__12(); 

                }
                break;
            case 4 :
                // InternalSiriusTextDsl.g:1:28: T__13
                {
                mT__13(); 

                }
                break;
            case 5 :
                // InternalSiriusTextDsl.g:1:34: T__14
                {
                mT__14(); 

                }
                break;
            case 6 :
                // InternalSiriusTextDsl.g:1:40: T__15
                {
                mT__15(); 

                }
                break;
            case 7 :
                // InternalSiriusTextDsl.g:1:46: T__16
                {
                mT__16(); 

                }
                break;
            case 8 :
                // InternalSiriusTextDsl.g:1:52: T__17
                {
                mT__17(); 

                }
                break;
            case 9 :
                // InternalSiriusTextDsl.g:1:58: T__18
                {
                mT__18(); 

                }
                break;
            case 10 :
                // InternalSiriusTextDsl.g:1:64: T__19
                {
                mT__19(); 

                }
                break;
            case 11 :
                // InternalSiriusTextDsl.g:1:70: T__20
                {
                mT__20(); 

                }
                break;
            case 12 :
                // InternalSiriusTextDsl.g:1:76: T__21
                {
                mT__21(); 

                }
                break;
            case 13 :
                // InternalSiriusTextDsl.g:1:82: T__22
                {
                mT__22(); 

                }
                break;
            case 14 :
                // InternalSiriusTextDsl.g:1:88: T__23
                {
                mT__23(); 

                }
                break;
            case 15 :
                // InternalSiriusTextDsl.g:1:94: T__24
                {
                mT__24(); 

                }
                break;
            case 16 :
                // InternalSiriusTextDsl.g:1:100: T__25
                {
                mT__25(); 

                }
                break;
            case 17 :
                // InternalSiriusTextDsl.g:1:106: T__26
                {
                mT__26(); 

                }
                break;
            case 18 :
                // InternalSiriusTextDsl.g:1:112: T__27
                {
                mT__27(); 

                }
                break;
            case 19 :
                // InternalSiriusTextDsl.g:1:118: T__28
                {
                mT__28(); 

                }
                break;
            case 20 :
                // InternalSiriusTextDsl.g:1:124: T__29
                {
                mT__29(); 

                }
                break;
            case 21 :
                // InternalSiriusTextDsl.g:1:130: T__30
                {
                mT__30(); 

                }
                break;
            case 22 :
                // InternalSiriusTextDsl.g:1:136: T__31
                {
                mT__31(); 

                }
                break;
            case 23 :
                // InternalSiriusTextDsl.g:1:142: T__32
                {
                mT__32(); 

                }
                break;
            case 24 :
                // InternalSiriusTextDsl.g:1:148: T__33
                {
                mT__33(); 

                }
                break;
            case 25 :
                // InternalSiriusTextDsl.g:1:154: T__34
                {
                mT__34(); 

                }
                break;
            case 26 :
                // InternalSiriusTextDsl.g:1:160: T__35
                {
                mT__35(); 

                }
                break;
            case 27 :
                // InternalSiriusTextDsl.g:1:166: T__36
                {
                mT__36(); 

                }
                break;
            case 28 :
                // InternalSiriusTextDsl.g:1:172: T__37
                {
                mT__37(); 

                }
                break;
            case 29 :
                // InternalSiriusTextDsl.g:1:178: T__38
                {
                mT__38(); 

                }
                break;
            case 30 :
                // InternalSiriusTextDsl.g:1:184: T__39
                {
                mT__39(); 

                }
                break;
            case 31 :
                // InternalSiriusTextDsl.g:1:190: T__40
                {
                mT__40(); 

                }
                break;
            case 32 :
                // InternalSiriusTextDsl.g:1:196: T__41
                {
                mT__41(); 

                }
                break;
            case 33 :
                // InternalSiriusTextDsl.g:1:202: T__42
                {
                mT__42(); 

                }
                break;
            case 34 :
                // InternalSiriusTextDsl.g:1:208: T__43
                {
                mT__43(); 

                }
                break;
            case 35 :
                // InternalSiriusTextDsl.g:1:214: T__44
                {
                mT__44(); 

                }
                break;
            case 36 :
                // InternalSiriusTextDsl.g:1:220: T__45
                {
                mT__45(); 

                }
                break;
            case 37 :
                // InternalSiriusTextDsl.g:1:226: T__46
                {
                mT__46(); 

                }
                break;
            case 38 :
                // InternalSiriusTextDsl.g:1:232: T__47
                {
                mT__47(); 

                }
                break;
            case 39 :
                // InternalSiriusTextDsl.g:1:238: T__48
                {
                mT__48(); 

                }
                break;
            case 40 :
                // InternalSiriusTextDsl.g:1:244: T__49
                {
                mT__49(); 

                }
                break;
            case 41 :
                // InternalSiriusTextDsl.g:1:250: T__50
                {
                mT__50(); 

                }
                break;
            case 42 :
                // InternalSiriusTextDsl.g:1:256: T__51
                {
                mT__51(); 

                }
                break;
            case 43 :
                // InternalSiriusTextDsl.g:1:262: T__52
                {
                mT__52(); 

                }
                break;
            case 44 :
                // InternalSiriusTextDsl.g:1:268: T__53
                {
                mT__53(); 

                }
                break;
            case 45 :
                // InternalSiriusTextDsl.g:1:274: T__54
                {
                mT__54(); 

                }
                break;
            case 46 :
                // InternalSiriusTextDsl.g:1:280: T__55
                {
                mT__55(); 

                }
                break;
            case 47 :
                // InternalSiriusTextDsl.g:1:286: T__56
                {
                mT__56(); 

                }
                break;
            case 48 :
                // InternalSiriusTextDsl.g:1:292: T__57
                {
                mT__57(); 

                }
                break;
            case 49 :
                // InternalSiriusTextDsl.g:1:298: T__58
                {
                mT__58(); 

                }
                break;
            case 50 :
                // InternalSiriusTextDsl.g:1:304: T__59
                {
                mT__59(); 

                }
                break;
            case 51 :
                // InternalSiriusTextDsl.g:1:310: T__60
                {
                mT__60(); 

                }
                break;
            case 52 :
                // InternalSiriusTextDsl.g:1:316: T__61
                {
                mT__61(); 

                }
                break;
            case 53 :
                // InternalSiriusTextDsl.g:1:322: T__62
                {
                mT__62(); 

                }
                break;
            case 54 :
                // InternalSiriusTextDsl.g:1:328: T__63
                {
                mT__63(); 

                }
                break;
            case 55 :
                // InternalSiriusTextDsl.g:1:334: T__64
                {
                mT__64(); 

                }
                break;
            case 56 :
                // InternalSiriusTextDsl.g:1:340: T__65
                {
                mT__65(); 

                }
                break;
            case 57 :
                // InternalSiriusTextDsl.g:1:346: T__66
                {
                mT__66(); 

                }
                break;
            case 58 :
                // InternalSiriusTextDsl.g:1:352: T__67
                {
                mT__67(); 

                }
                break;
            case 59 :
                // InternalSiriusTextDsl.g:1:358: T__68
                {
                mT__68(); 

                }
                break;
            case 60 :
                // InternalSiriusTextDsl.g:1:364: T__69
                {
                mT__69(); 

                }
                break;
            case 61 :
                // InternalSiriusTextDsl.g:1:370: T__70
                {
                mT__70(); 

                }
                break;
            case 62 :
                // InternalSiriusTextDsl.g:1:376: T__71
                {
                mT__71(); 

                }
                break;
            case 63 :
                // InternalSiriusTextDsl.g:1:382: T__72
                {
                mT__72(); 

                }
                break;
            case 64 :
                // InternalSiriusTextDsl.g:1:388: T__73
                {
                mT__73(); 

                }
                break;
            case 65 :
                // InternalSiriusTextDsl.g:1:394: T__74
                {
                mT__74(); 

                }
                break;
            case 66 :
                // InternalSiriusTextDsl.g:1:400: T__75
                {
                mT__75(); 

                }
                break;
            case 67 :
                // InternalSiriusTextDsl.g:1:406: T__76
                {
                mT__76(); 

                }
                break;
            case 68 :
                // InternalSiriusTextDsl.g:1:412: T__77
                {
                mT__77(); 

                }
                break;
            case 69 :
                // InternalSiriusTextDsl.g:1:418: T__78
                {
                mT__78(); 

                }
                break;
            case 70 :
                // InternalSiriusTextDsl.g:1:424: T__79
                {
                mT__79(); 

                }
                break;
            case 71 :
                // InternalSiriusTextDsl.g:1:430: T__80
                {
                mT__80(); 

                }
                break;
            case 72 :
                // InternalSiriusTextDsl.g:1:436: T__81
                {
                mT__81(); 

                }
                break;
            case 73 :
                // InternalSiriusTextDsl.g:1:442: T__82
                {
                mT__82(); 

                }
                break;
            case 74 :
                // InternalSiriusTextDsl.g:1:448: T__83
                {
                mT__83(); 

                }
                break;
            case 75 :
                // InternalSiriusTextDsl.g:1:454: T__84
                {
                mT__84(); 

                }
                break;
            case 76 :
                // InternalSiriusTextDsl.g:1:460: T__85
                {
                mT__85(); 

                }
                break;
            case 77 :
                // InternalSiriusTextDsl.g:1:466: T__86
                {
                mT__86(); 

                }
                break;
            case 78 :
                // InternalSiriusTextDsl.g:1:472: T__87
                {
                mT__87(); 

                }
                break;
            case 79 :
                // InternalSiriusTextDsl.g:1:478: T__88
                {
                mT__88(); 

                }
                break;
            case 80 :
                // InternalSiriusTextDsl.g:1:484: T__89
                {
                mT__89(); 

                }
                break;
            case 81 :
                // InternalSiriusTextDsl.g:1:490: T__90
                {
                mT__90(); 

                }
                break;
            case 82 :
                // InternalSiriusTextDsl.g:1:496: T__91
                {
                mT__91(); 

                }
                break;
            case 83 :
                // InternalSiriusTextDsl.g:1:502: T__92
                {
                mT__92(); 

                }
                break;
            case 84 :
                // InternalSiriusTextDsl.g:1:508: T__93
                {
                mT__93(); 

                }
                break;
            case 85 :
                // InternalSiriusTextDsl.g:1:514: T__94
                {
                mT__94(); 

                }
                break;
            case 86 :
                // InternalSiriusTextDsl.g:1:520: T__95
                {
                mT__95(); 

                }
                break;
            case 87 :
                // InternalSiriusTextDsl.g:1:526: T__96
                {
                mT__96(); 

                }
                break;
            case 88 :
                // InternalSiriusTextDsl.g:1:532: T__97
                {
                mT__97(); 

                }
                break;
            case 89 :
                // InternalSiriusTextDsl.g:1:538: T__98
                {
                mT__98(); 

                }
                break;
            case 90 :
                // InternalSiriusTextDsl.g:1:544: T__99
                {
                mT__99(); 

                }
                break;
            case 91 :
                // InternalSiriusTextDsl.g:1:550: T__100
                {
                mT__100(); 

                }
                break;
            case 92 :
                // InternalSiriusTextDsl.g:1:557: RULE_DOCUMENTATION
                {
                mRULE_DOCUMENTATION(); 

                }
                break;
            case 93 :
                // InternalSiriusTextDsl.g:1:576: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 94 :
                // InternalSiriusTextDsl.g:1:584: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 95 :
                // InternalSiriusTextDsl.g:1:593: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 96 :
                // InternalSiriusTextDsl.g:1:605: RULE_EXPRESSION
                {
                mRULE_EXPRESSION(); 

                }
                break;
            case 97 :
                // InternalSiriusTextDsl.g:1:621: RULE_WS
                {
                mRULE_WS(); 

                }
                break;

        }

    }


    protected DFA8 dfa8 = new DFA8(this);
    static final String DFA8_eotS =
        "\1\uffff\1\45\1\54\3\45\1\uffff\1\70\2\45\4\uffff\1\45\2\uffff\1\45\1\uffff\11\45\1\uffff\7\45\6\uffff\1\45\2\uffff\2\45\1\144\1\145\4\45\1\154\1\45\2\uffff\7\45\4\uffff\3\45\1\175\34\45\2\uffff\4\45\1\u00a4\1\45\1\uffff\13\45\1\u00b1\4\45\1\uffff\41\45\1\u00d7\4\45\1\uffff\1\u00dd\11\45\1\uffff\1\45\1\uffff\1\45\1\u00e9\3\45\1\u00ed\2\45\1\u00f0\1\u00f1\1\u00f3\10\45\1\u00fe\4\45\1\u0103\10\45\1\u010c\3\45\1\uffff\5\45\1\uffff\11\45\1\u011e\1\45\1\uffff\3\45\1\uffff\1\u0123\1\u0124\2\uffff\1\45\1\uffff\1\u0126\3\45\1\u012a\1\45\1\u012c\3\45\1\uffff\1\45\1\u0131\2\45\1\uffff\10\45\1\uffff\2\45\1\u0140\16\45\1\uffff\3\45\1\u0155\2\uffff\1\45\1\uffff\3\45\1\uffff\1\u015a\1\uffff\3\45\1\u0160\1\uffff\1\45\1\u0162\12\45\1\u016f\1\u0170\1\uffff\2\45\1\u0173\12\45\1\u017e\6\45\1\uffff\4\45\1\uffff\5\45\1\uffff\1\45\1\uffff\2\45\1\u0191\7\45\1\u0199\1\45\2\uffff\1\u019b\1\45\1\uffff\1\45\1\u019e\3\45\1\u01a2\4\45\1\uffff\12\45\1\u01b1\4\45\1\u01b6\2\45\1\uffff\7\45\1\uffff\1\45\1\uffff\2\45\1\uffff\1\45\1\u01c4\1\45\1\uffff\1\u01c6\12\45\1\u01d1\1\45\1\u01d3\1\uffff\4\45\1\uffff\15\45\1\uffff\1\45\1\uffff\12\45\1\uffff\1\45\1\uffff\12\45\1\u01fc\14\45\1\u0209\2\45\1\u020c\1\u020d\4\45\1\u0212\3\45\1\u0216\3\45\1\uffff\2\45\1\u021c\1\u021d\6\45\1\u0224\1\45\1\uffff\2\45\2\uffff\4\45\1\uffff\2\45\1\u022e\1\uffff\5\45\2\uffff\1\u0234\5\45\1\uffff\3\45\1\u023d\5\45\1\uffff\5\45\1\uffff\4\45\1\u024c\1\45\1\u024e\1\45\1\uffff\2\45\1\u0252\11\45\1\u025d\1\45\1\uffff\1\u025f\1\uffff\3\45\1\uffff\10\45\1\u026b\1\45\1\uffff\1\45\1\uffff\11\45\1\u0277\1\45\1\uffff\1\45\1\u027a\5\45\1\u0280\3\45\1\uffff\2\45\1\uffff\5\45\1\uffff\4\45\1\u028f\11\45\1\uffff\1\u0299\7\45\1\u02a1\1\uffff\4\45\1\u02a6\1\u02a7\1\45\1\uffff\4\45\2\uffff\14\45\1\u02b9\2\45\1\u02bc\1\45\1\uffff\1\45\1\u02bf\1\uffff\1\45\1\u02c1\1\uffff\1\u02c2\2\uffff";
    static final String DFA8_eofS =
        "\u02c3\uffff";
    static final String DFA8_minS =
        "\1\11\1\141\1\52\1\143\1\141\1\144\1\uffff\1\51\1\151\1\141\4\uffff\1\145\1\105\1\uffff\1\157\1\uffff\2\141\1\144\2\145\1\162\1\157\1\145\1\151\1\uffff\1\142\1\157\1\165\1\156\2\151\1\157\6\uffff\1\143\2\uffff\1\160\1\157\2\60\1\146\1\141\1\143\1\163\1\60\1\144\2\uffff\1\145\1\144\1\156\1\154\1\157\1\142\1\147\4\uffff\1\154\1\157\1\164\1\60\1\162\1\145\1\142\1\156\1\146\1\147\1\144\1\154\1\156\1\162\1\155\1\172\1\154\1\141\1\162\1\151\1\144\1\154\1\104\1\164\1\160\1\141\1\154\1\156\1\153\1\145\1\157\1\156\2\uffff\1\151\1\141\1\147\1\165\1\60\1\150\1\uffff\1\151\1\167\1\145\1\160\1\150\1\162\1\141\2\164\1\50\1\150\1\60\1\144\1\155\1\154\1\164\1\uffff\1\147\3\145\1\164\1\145\1\164\1\145\1\163\1\164\1\157\1\164\1\154\2\141\1\145\1\162\1\151\2\144\1\150\1\147\1\164\1\151\1\145\1\160\1\165\1\155\1\154\1\145\1\141\1\164\1\162\1\60\1\147\1\165\1\162\1\155\1\uffff\1\60\1\164\1\160\1\154\1\151\1\141\1\145\1\164\1\105\1\151\1\uffff\1\164\1\uffff\1\151\1\60\1\145\1\157\1\145\1\60\1\162\1\154\3\60\1\123\1\103\1\141\1\162\2\145\1\151\1\156\1\60\1\143\1\144\1\151\1\145\1\60\2\150\1\161\1\143\1\165\1\164\1\157\1\104\1\60\1\147\2\164\1\uffff\1\156\1\154\1\141\1\145\1\144\1\uffff\1\151\1\157\1\106\1\156\1\164\1\163\1\151\1\170\1\156\1\60\1\156\1\uffff\1\105\1\142\1\164\1\uffff\2\60\2\uffff\1\157\1\uffff\1\60\1\164\1\145\1\151\1\60\1\162\1\60\1\147\1\164\1\157\1\uffff\1\145\1\60\1\145\1\162\1\uffff\1\164\1\103\1\165\1\157\1\164\1\101\1\156\1\151\1\uffff\2\145\1\60\1\145\1\164\1\155\1\156\2\157\2\151\1\147\1\164\1\145\1\157\1\160\1\147\1\uffff\1\147\1\170\1\157\1\60\2\uffff\1\162\1\uffff\1\171\2\156\1\uffff\1\60\1\uffff\1\150\1\151\1\155\1\60\1\uffff\1\156\1\60\1\103\1\157\1\145\1\162\1\101\1\162\1\154\1\151\1\144\1\141\2\60\1\uffff\1\162\1\114\1\60\2\164\2\156\1\154\1\163\1\141\2\156\1\162\1\60\1\123\1\160\1\164\1\141\1\151\1\162\1\uffff\1\151\1\154\1\164\1\145\1\uffff\1\164\1\143\1\160\1\141\1\162\1\uffff\1\164\1\uffff\1\157\1\155\1\60\1\141\1\162\1\154\1\151\1\162\1\157\1\154\1\60\1\155\2\uffff\1\60\1\141\1\uffff\1\141\1\60\1\141\1\164\1\145\1\60\1\156\1\164\1\102\1\145\1\uffff\1\164\1\162\1\164\1\160\1\154\1\162\1\147\2\145\1\162\1\60\1\103\1\165\1\160\1\162\1\60\1\155\1\160\1\uffff\1\164\1\162\1\157\1\154\1\157\1\163\1\154\1\uffff\1\157\1\uffff\1\171\1\164\1\uffff\1\154\1\60\1\105\1\uffff\1\60\2\141\1\163\1\171\1\145\1\157\1\160\1\145\1\157\1\150\1\60\1\162\1\60\1\uffff\1\141\1\164\1\160\1\157\1\uffff\1\160\1\165\1\151\1\157\1\163\1\154\1\167\1\145\1\103\1\156\1\145\1\151\1\114\1\uffff\1\170\1\uffff\1\164\2\163\1\154\1\163\1\155\1\151\1\105\1\167\1\164\1\uffff\1\151\1\uffff\1\156\1\141\1\151\1\167\1\165\1\164\1\157\1\167\1\145\1\103\1\60\1\144\1\154\1\144\1\162\1\157\1\141\1\164\1\151\1\145\1\151\1\145\1\163\1\60\1\156\1\170\2\60\1\156\1\144\1\164\1\156\1\60\1\164\1\141\1\156\1\60\1\144\1\154\1\151\1\uffff\1\101\1\157\2\60\1\156\1\171\1\145\1\157\1\144\1\157\1\60\1\151\1\uffff\1\147\1\160\2\uffff\1\147\2\151\1\147\1\uffff\1\141\1\164\1\60\1\uffff\1\101\1\157\1\164\1\162\1\163\2\uffff\1\60\1\145\2\156\1\105\1\156\1\uffff\1\157\1\163\1\162\1\60\1\144\1\157\1\163\1\164\1\151\1\uffff\1\162\1\163\1\150\1\162\1\145\1\uffff\1\162\2\163\1\144\1\60\1\156\1\60\1\145\1\uffff\1\141\1\156\1\60\1\151\1\157\1\162\1\145\1\104\1\157\1\144\1\163\1\151\1\60\1\147\1\uffff\1\60\1\uffff\1\163\1\164\1\105\1\uffff\1\157\1\156\1\157\1\144\2\151\1\167\1\101\1\60\1\157\1\uffff\1\145\1\uffff\1\163\1\145\1\170\1\156\1\105\1\167\1\101\1\141\1\154\1\60\1\162\1\uffff\1\156\1\60\1\151\1\163\1\160\1\105\1\170\1\60\1\162\1\155\1\154\1\uffff\1\162\1\163\1\uffff\1\157\1\105\1\162\1\170\1\160\1\uffff\1\162\1\157\1\104\1\157\1\60\1\156\1\170\1\145\1\160\1\162\1\157\1\156\1\151\1\167\1\uffff\1\60\1\160\1\163\1\162\1\145\1\167\1\144\1\141\1\60\1\uffff\1\162\1\163\1\145\1\163\2\60\1\155\1\uffff\1\145\1\151\2\163\2\uffff\1\157\1\163\1\157\1\163\1\151\1\156\1\163\1\156\1\151\1\157\1\144\1\151\1\60\1\157\1\156\1\60\1\157\1\uffff\1\156\1\60\1\uffff\1\156\1\60\1\uffff\1\60\2\uffff";
    static final String DFA8_maxS =
        "\1\175\1\141\1\52\1\156\1\157\1\163\1\uffff\1\51\1\151\1\157\4\uffff\1\157\1\123\1\uffff\1\162\1\uffff\1\162\1\151\1\156\1\157\1\164\1\162\1\157\1\145\1\151\1\uffff\1\142\1\157\1\165\1\156\2\151\1\157\6\uffff\1\154\2\uffff\1\160\1\157\2\172\1\163\1\141\1\164\1\163\1\172\1\144\2\uffff\1\145\1\144\2\160\1\165\1\142\1\147\4\uffff\1\162\1\157\1\164\1\172\1\162\1\145\1\171\1\163\1\146\1\147\1\144\2\156\1\171\1\155\1\172\1\165\1\141\1\164\1\151\1\144\1\154\1\104\1\164\1\160\1\141\1\154\1\156\1\153\1\145\1\157\1\156\2\uffff\1\151\1\141\1\147\1\165\1\172\1\150\1\uffff\1\151\1\167\1\145\1\160\1\150\1\162\1\141\2\164\1\50\1\150\1\172\1\144\1\155\1\154\1\164\1\uffff\1\147\3\145\1\164\1\145\1\164\1\145\1\163\1\164\1\157\1\164\1\154\2\141\1\145\1\162\1\151\2\144\1\150\1\147\1\164\1\151\1\145\1\160\1\165\1\155\1\154\1\145\1\141\1\164\1\162\1\172\1\147\1\165\1\162\1\155\1\uffff\1\172\1\164\1\160\1\154\1\151\1\141\1\145\1\164\1\105\1\151\1\uffff\1\164\1\uffff\1\151\1\172\1\145\1\157\1\145\1\172\1\162\1\154\3\172\1\163\1\103\1\141\1\162\2\145\1\151\1\156\1\172\1\143\1\144\1\151\1\145\1\172\2\150\1\161\1\143\1\165\1\164\1\157\1\104\1\172\1\147\2\164\1\uffff\1\156\1\154\1\141\1\145\1\144\1\uffff\1\151\1\157\1\106\1\156\1\164\1\163\1\151\1\170\1\156\1\172\1\156\1\uffff\1\105\1\142\1\164\1\uffff\2\172\2\uffff\1\157\1\uffff\1\172\1\164\1\145\1\151\1\172\1\162\1\172\1\147\1\164\1\157\1\uffff\1\145\1\172\1\145\1\162\1\uffff\1\164\1\103\1\165\1\157\1\164\1\106\1\156\1\151\1\uffff\2\145\1\172\1\145\1\164\1\155\1\156\2\157\2\151\1\147\1\164\1\145\1\157\1\160\1\147\1\uffff\1\147\1\170\1\157\1\172\2\uffff\1\162\1\uffff\1\171\2\156\1\uffff\1\172\1\uffff\1\150\1\151\1\155\1\172\1\uffff\1\156\1\172\1\103\1\157\1\145\1\162\1\106\1\162\1\154\1\151\1\144\1\141\2\172\1\uffff\1\162\1\114\1\172\2\164\2\156\1\154\1\163\1\141\2\156\1\162\1\172\1\123\1\160\1\164\1\141\1\151\1\162\1\uffff\1\151\1\154\1\164\1\145\1\uffff\1\164\1\143\1\160\1\141\1\162\1\uffff\1\164\1\uffff\1\157\1\155\1\172\1\141\1\162\1\154\1\151\1\162\1\157\1\154\1\172\1\155\2\uffff\1\172\1\141\1\uffff\1\141\1\172\1\141\1\164\1\145\1\172\1\156\1\164\1\102\1\145\1\uffff\1\164\1\162\1\164\1\160\1\154\1\162\1\147\2\145\1\162\1\172\1\103\1\165\1\160\1\162\1\172\1\155\1\160\1\uffff\1\164\1\162\1\157\1\154\1\157\1\163\1\154\1\uffff\1\157\1\uffff\1\171\1\164\1\uffff\1\154\1\172\1\105\1\uffff\1\172\2\141\1\163\1\171\1\145\1\157\1\160\1\145\1\157\1\150\1\172\1\162\1\172\1\uffff\1\141\1\164\1\160\1\157\1\uffff\1\160\1\165\1\151\1\157\1\163\1\154\1\167\1\145\1\103\1\156\1\145\1\151\1\114\1\uffff\1\170\1\uffff\1\164\2\163\1\154\1\163\1\155\1\151\1\105\1\167\1\164\1\uffff\1\151\1\uffff\1\156\1\141\1\151\1\167\1\165\1\164\1\157\1\167\1\145\1\103\1\172\1\144\1\154\1\144\1\162\1\157\1\141\1\164\1\151\1\145\1\151\1\145\1\163\1\172\1\156\1\170\2\172\1\156\1\144\1\164\1\156\1\172\1\164\1\141\1\156\1\172\1\144\1\154\1\151\1\uffff\1\101\1\157\2\172\1\156\1\171\1\145\1\157\1\144\1\157\1\172\1\151\1\uffff\1\147\1\160\2\uffff\1\147\2\151\1\147\1\uffff\1\141\1\164\1\172\1\uffff\1\101\1\157\1\164\1\162\1\163\2\uffff\1\172\1\145\2\156\1\105\1\156\1\uffff\1\157\1\163\1\162\1\172\1\144\1\157\1\163\1\164\1\151\1\uffff\1\162\1\163\1\150\1\162\1\145\1\uffff\1\162\2\163\1\144\1\172\1\156\1\172\1\145\1\uffff\1\141\1\156\1\172\1\151\1\157\1\162\1\145\1\106\1\157\1\144\1\163\1\151\1\172\1\147\1\uffff\1\172\1\uffff\1\163\1\164\1\105\1\uffff\1\157\1\156\1\157\1\144\2\151\1\167\1\101\1\172\1\157\1\uffff\1\145\1\uffff\1\163\1\145\1\170\1\156\1\105\1\167\1\101\1\141\1\154\1\172\1\162\1\uffff\1\156\1\172\1\151\1\163\1\160\1\105\1\170\1\172\1\162\1\155\1\154\1\uffff\1\162\1\163\1\uffff\1\157\1\105\1\162\1\170\1\160\1\uffff\1\162\1\157\1\104\1\157\1\172\1\156\1\170\1\145\1\160\1\162\1\157\1\156\1\151\1\167\1\uffff\1\172\1\160\1\163\1\162\1\145\1\167\1\144\1\141\1\172\1\uffff\1\162\1\163\1\145\1\163\2\172\1\155\1\uffff\1\145\1\151\2\163\2\uffff\1\157\1\163\1\157\1\163\1\151\1\156\1\163\1\156\1\151\1\157\1\144\1\151\1\172\1\157\1\156\1\172\1\157\1\uffff\1\156\1\172\1\uffff\1\156\1\172\1\uffff\1\172\2\uffff";
    static final String DFA8_acceptS =
        "\6\uffff\1\7\3\uffff\1\13\1\14\1\15\1\16\2\uffff\1\25\1\uffff\1\31\11\uffff\1\77\7\uffff\1\134\1\135\1\136\1\137\1\140\1\141\1\uffff\1\3\1\2\12\uffff\1\26\1\10\7\uffff\1\21\1\22\1\23\1\24\40\uffff\1\46\1\53\6\uffff\1\6\20\uffff\1\51\46\uffff\1\110\12\uffff\1\76\1\uffff\1\30\45\uffff\1\17\5\uffff\1\107\13\uffff\1\50\3\uffff\1\114\2\uffff\1\42\1\65\1\uffff\1\100\12\uffff\1\55\4\uffff\1\133\10\uffff\1\130\21\uffff\1\102\4\uffff\1\37\1\52\1\uffff\1\41\3\uffff\1\75\1\uffff\1\44\4\uffff\1\106\16\uffff\1\4\24\uffff\1\132\4\uffff\1\101\5\uffff\1\131\1\uffff\1\54\14\uffff\1\1\1\74\2\uffff\1\27\12\uffff\1\66\22\uffff\1\103\7\uffff\1\124\1\uffff\1\5\2\uffff\1\111\3\uffff\1\40\16\uffff\1\112\4\uffff\1\47\15\uffff\1\11\1\uffff\1\113\12\uffff\1\64\1\uffff\1\43\50\uffff\1\117\14\uffff\1\105\2\uffff\1\70\1\104\4\uffff\1\67\3\uffff\1\116\5\uffff\1\125\1\35\6\uffff\1\72\11\uffff\1\115\5\uffff\1\32\10\uffff\1\73\16\uffff\1\34\1\uffff\1\62\3\uffff\1\61\12\uffff\1\20\1\uffff\1\33\13\uffff\1\36\13\uffff\1\121\2\uffff\1\60\5\uffff\1\120\16\uffff\1\12\11\uffff\1\63\7\uffff\1\123\4\uffff\1\122\1\126\21\uffff\1\71\2\uffff\1\127\2\uffff\1\57\1\uffff\1\56\1\45";
    static final String DFA8_specialS =
        "\u02c3\uffff}>";
    static final String[] DFA8_transitionS = {
            "\2\51\2\uffff\1\51\22\uffff\1\51\1\uffff\1\50\4\uffff\1\47\1\20\1\34\2\uffff\1\14\1\uffff\1\2\1\44\12\46\3\uffff\1\12\1\uffff\1\22\1\17\3\45\1\41\1\45\1\42\2\45\1\40\4\45\1\36\1\37\13\45\1\13\1\uffff\1\15\2\45\1\uffff\1\5\1\31\1\26\1\4\1\25\1\21\1\30\1\32\1\3\2\45\1\24\1\11\1\43\1\35\1\1\1\45\1\16\1\27\1\23\1\45\1\10\1\33\3\45\1\6\1\uffff\1\7",
            "\1\52",
            "\1\53",
            "\1\56\2\uffff\1\57\6\uffff\1\55\1\60",
            "\1\64\3\uffff\1\61\3\uffff\1\62\5\uffff\1\63",
            "\1\66\16\uffff\1\65",
            "",
            "\1\67",
            "\1\71",
            "\1\73\15\uffff\1\72",
            "",
            "",
            "",
            "",
            "\1\74\1\uffff\1\76\1\uffff\1\77\5\uffff\1\75",
            "\1\102\3\uffff\1\100\3\uffff\1\103\5\uffff\1\101",
            "",
            "\1\104\2\uffff\1\105",
            "",
            "\1\110\7\uffff\1\106\5\uffff\1\107\2\uffff\1\111",
            "\1\112\3\uffff\1\114\3\uffff\1\113",
            "\1\115\11\uffff\1\116",
            "\1\120\11\uffff\1\117",
            "\1\122\3\uffff\1\123\5\uffff\1\124\4\uffff\1\121",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\140\10\uffff\1\141",
            "",
            "",
            "\1\142",
            "\1\143",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\147\14\uffff\1\146",
            "\1\150",
            "\1\151\20\uffff\1\152",
            "\1\153",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\155",
            "",
            "",
            "\1\156",
            "\1\157",
            "\1\161\1\uffff\1\160",
            "\1\163\3\uffff\1\162",
            "\1\164\5\uffff\1\165",
            "\1\166",
            "\1\167",
            "",
            "",
            "",
            "",
            "\1\171\5\uffff\1\170",
            "\1\172",
            "\1\173",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\17\45\1\174\12\45",
            "\1\176",
            "\1\177",
            "\1\u0081\26\uffff\1\u0080",
            "\1\u0083\4\uffff\1\u0082",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0088\1\uffff\1\u0087",
            "\1\u0089",
            "\1\u008b\6\uffff\1\u008a",
            "\1\u008c",
            "\1\u008d",
            "\1\u008f\10\uffff\1\u008e",
            "\1\u0090",
            "\1\u0091\1\uffff\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "",
            "",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00a5",
            "",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\u00dc\1\uffff\32\45",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "",
            "\1\u00e7",
            "",
            "\1\u00e8",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00ee",
            "\1\u00ef",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\23\45\1\u00f2\6\45",
            "\1\u00f5\37\uffff\1\u00f4",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\12\45\7\uffff\2\45\1\u00fd\27\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "",
            "\1\u0115",
            "\1\u0116",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u011f",
            "",
            "\1\u0120",
            "\1\u0121",
            "\1\u0122",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "",
            "\1\u0125",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u0127",
            "\1\u0128",
            "\1\u0129",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u012b",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u012d",
            "\1\u012e",
            "\1\u012f",
            "",
            "\1\u0130",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u0132",
            "\1\u0133",
            "",
            "\1\u0134",
            "\1\u0135",
            "\1\u0136",
            "\1\u0137",
            "\1\u0138",
            "\1\u0139\1\uffff\1\u013a\2\uffff\1\u013b",
            "\1\u013c",
            "\1\u013d",
            "",
            "\1\u013e",
            "\1\u013f",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u0141",
            "\1\u0142",
            "\1\u0143",
            "\1\u0144",
            "\1\u0145",
            "\1\u0146",
            "\1\u0147",
            "\1\u0148",
            "\1\u0149",
            "\1\u014a",
            "\1\u014b",
            "\1\u014c",
            "\1\u014d",
            "\1\u014e",
            "",
            "\1\u014f",
            "\1\u0150",
            "\1\u0151",
            "\12\45\7\uffff\1\u0154\4\45\1\u0153\6\45\1\u0152\15\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "",
            "\1\u0156",
            "",
            "\1\u0157",
            "\1\u0158",
            "\1\u0159",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\1\u015b",
            "\1\u015c",
            "\1\u015d",
            "\12\45\7\uffff\1\u015f\13\45\1\u015e\15\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\1\u0161",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u0163",
            "\1\u0164",
            "\1\u0165",
            "\1\u0166",
            "\1\u0167\1\uffff\1\u0168\2\uffff\1\u0169",
            "\1\u016a",
            "\1\u016b",
            "\1\u016c",
            "\1\u016d",
            "\1\u016e",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\1\u0171",
            "\1\u0172",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u0174",
            "\1\u0175",
            "\1\u0176",
            "\1\u0177",
            "\1\u0178",
            "\1\u0179",
            "\1\u017a",
            "\1\u017b",
            "\1\u017c",
            "\1\u017d",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u017f",
            "\1\u0180",
            "\1\u0181",
            "\1\u0182",
            "\1\u0183",
            "\1\u0184",
            "",
            "\1\u0185",
            "\1\u0186",
            "\1\u0187",
            "\1\u0188",
            "",
            "\1\u0189",
            "\1\u018a",
            "\1\u018b",
            "\1\u018c",
            "\1\u018d",
            "",
            "\1\u018e",
            "",
            "\1\u018f",
            "\1\u0190",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u0192",
            "\1\u0193",
            "\1\u0194",
            "\1\u0195",
            "\1\u0196",
            "\1\u0197",
            "\1\u0198",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u019a",
            "",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u019c",
            "",
            "\1\u019d",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u019f",
            "\1\u01a0",
            "\1\u01a1",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u01a3",
            "\1\u01a4",
            "\1\u01a5",
            "\1\u01a6",
            "",
            "\1\u01a7",
            "\1\u01a8",
            "\1\u01a9",
            "\1\u01aa",
            "\1\u01ab",
            "\1\u01ac",
            "\1\u01ad",
            "\1\u01ae",
            "\1\u01af",
            "\1\u01b0",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u01b2",
            "\1\u01b3",
            "\1\u01b4",
            "\1\u01b5",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u01b7",
            "\1\u01b8",
            "",
            "\1\u01b9",
            "\1\u01ba",
            "\1\u01bb",
            "\1\u01bc",
            "\1\u01bd",
            "\1\u01be",
            "\1\u01bf",
            "",
            "\1\u01c0",
            "",
            "\1\u01c1",
            "\1\u01c2",
            "",
            "\1\u01c3",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u01c5",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u01c7",
            "\1\u01c8",
            "\1\u01c9",
            "\1\u01ca",
            "\1\u01cb",
            "\1\u01cc",
            "\1\u01cd",
            "\1\u01ce",
            "\1\u01cf",
            "\1\u01d0",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u01d2",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\1\u01d4",
            "\1\u01d5",
            "\1\u01d6",
            "\1\u01d7",
            "",
            "\1\u01d8",
            "\1\u01d9",
            "\1\u01da",
            "\1\u01db",
            "\1\u01dc",
            "\1\u01dd",
            "\1\u01de",
            "\1\u01df",
            "\1\u01e0",
            "\1\u01e1",
            "\1\u01e2",
            "\1\u01e3",
            "\1\u01e4",
            "",
            "\1\u01e5",
            "",
            "\1\u01e6",
            "\1\u01e7",
            "\1\u01e8",
            "\1\u01e9",
            "\1\u01ea",
            "\1\u01eb",
            "\1\u01ec",
            "\1\u01ed",
            "\1\u01ee",
            "\1\u01ef",
            "",
            "\1\u01f0",
            "",
            "\1\u01f1",
            "\1\u01f2",
            "\1\u01f3",
            "\1\u01f4",
            "\1\u01f5",
            "\1\u01f6",
            "\1\u01f7",
            "\1\u01f8",
            "\1\u01f9",
            "\1\u01fa",
            "\12\45\7\uffff\26\45\1\u01fb\3\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u01fd",
            "\1\u01fe",
            "\1\u01ff",
            "\1\u0200",
            "\1\u0201",
            "\1\u0202",
            "\1\u0203",
            "\1\u0204",
            "\1\u0205",
            "\1\u0206",
            "\1\u0207",
            "\1\u0208",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u020a",
            "\1\u020b",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u020e",
            "\1\u020f",
            "\1\u0210",
            "\1\u0211",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u0213",
            "\1\u0214",
            "\1\u0215",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u0217",
            "\1\u0218",
            "\1\u0219",
            "",
            "\1\u021a",
            "\1\u021b",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u021e",
            "\1\u021f",
            "\1\u0220",
            "\1\u0221",
            "\1\u0222",
            "\1\u0223",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u0225",
            "",
            "\1\u0226",
            "\1\u0227",
            "",
            "",
            "\1\u0228",
            "\1\u0229",
            "\1\u022a",
            "\1\u022b",
            "",
            "\1\u022c",
            "\1\u022d",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\1\u022f",
            "\1\u0230",
            "\1\u0231",
            "\1\u0232",
            "\1\u0233",
            "",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u0235",
            "\1\u0236",
            "\1\u0237",
            "\1\u0238",
            "\1\u0239",
            "",
            "\1\u023a",
            "\1\u023b",
            "\1\u023c",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u023e",
            "\1\u023f",
            "\1\u0240",
            "\1\u0241",
            "\1\u0242",
            "",
            "\1\u0243",
            "\1\u0244",
            "\1\u0245",
            "\1\u0246",
            "\1\u0247",
            "",
            "\1\u0248",
            "\1\u0249",
            "\1\u024a",
            "\1\u024b",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u024d",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u024f",
            "",
            "\1\u0250",
            "\1\u0251",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u0253",
            "\1\u0254",
            "\1\u0255",
            "\1\u0256",
            "\1\u0257\1\uffff\1\u0258",
            "\1\u0259",
            "\1\u025a",
            "\1\u025b",
            "\1\u025c",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u025e",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\1\u0260",
            "\1\u0261",
            "\1\u0262",
            "",
            "\1\u0263",
            "\1\u0264",
            "\1\u0265",
            "\1\u0266",
            "\1\u0267",
            "\1\u0268",
            "\1\u0269",
            "\1\u026a",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u026c",
            "",
            "\1\u026d",
            "",
            "\1\u026e",
            "\1\u026f",
            "\1\u0270",
            "\1\u0271",
            "\1\u0272",
            "\1\u0273",
            "\1\u0274",
            "\1\u0275",
            "\1\u0276",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u0278",
            "",
            "\1\u0279",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u027b",
            "\1\u027c",
            "\1\u027d",
            "\1\u027e",
            "\1\u027f",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u0281",
            "\1\u0282",
            "\1\u0283",
            "",
            "\1\u0284",
            "\1\u0285",
            "",
            "\1\u0286",
            "\1\u0287",
            "\1\u0288",
            "\1\u0289",
            "\1\u028a",
            "",
            "\1\u028b",
            "\1\u028c",
            "\1\u028d",
            "\1\u028e",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u0290",
            "\1\u0291",
            "\1\u0292",
            "\1\u0293",
            "\1\u0294",
            "\1\u0295",
            "\1\u0296",
            "\1\u0297",
            "\1\u0298",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u029a",
            "\1\u029b",
            "\1\u029c",
            "\1\u029d",
            "\1\u029e",
            "\1\u029f",
            "\1\u02a0",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\1\u02a2",
            "\1\u02a3",
            "\1\u02a4",
            "\1\u02a5",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u02a8",
            "",
            "\1\u02a9",
            "\1\u02aa",
            "\1\u02ab",
            "\1\u02ac",
            "",
            "",
            "\1\u02ad",
            "\1\u02ae",
            "\1\u02af",
            "\1\u02b0",
            "\1\u02b1",
            "\1\u02b2",
            "\1\u02b3",
            "\1\u02b4",
            "\1\u02b5",
            "\1\u02b6",
            "\1\u02b7",
            "\1\u02b8",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u02ba",
            "\1\u02bb",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u02bd",
            "",
            "\1\u02be",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\1\u02c0",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | RULE_DOCUMENTATION | RULE_ID | RULE_INT | RULE_STRING | RULE_EXPRESSION | RULE_WS );";
        }
    }
 

}