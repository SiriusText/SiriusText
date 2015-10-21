package org.obeonetwork.sirius.text.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.obeonetwork.sirius.text.services.SiriusTextDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSiriusTextDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DOCUMENTATION", "RULE_ID", "RULE_STRING", "RULE_EXPRESSION", "RULE_INT", "RULE_WS", "'package'", "'.'", "'.*'", "'import'", "'designer'", "'as'", "'{'", "'}'", "'viewpoint'", "'modelFileExtensions'", "'='", "'['", "','", "']'", "'icon'", "'representations'", "'@Initialized'", "'@ShowOnStartup'", "'@EnablePopupBars'", "'@MetamodelUris'", "'({'", "'})'", "'diagram'", "'for'", "'?'", "'documentation'", "'titleExpression'", "'rootExpression'", "'defaultLayer'", "'additionalLayers'", "'layer'", "'mappings'", "'edges'", "'list'", "'container'", "'style'", "'semanticCandidatesExpression'", "'if'", "'gradient'", "'from'", "'to'", "'label'", "'in'", "'border'", "'size'", "'height'", "'width'", "'palette'", "'color'", "'rgb('", "')'", "'left'", "'center'", "'right'", "'oblique'", "'lefttoright'", "'toptobottom'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__10=10;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int RULE_DOCUMENTATION=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int RULE_STRING=6;
    public static final int RULE_EXPRESSION=7;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
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

    // delegates
    // delegators


        public InternalSiriusTextDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSiriusTextDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSiriusTextDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSiriusTextDsl.g"; }



     	private SiriusTextDslGrammarAccess grammarAccess;
     	
        public InternalSiriusTextDslParser(TokenStream input, SiriusTextDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "SiriusFile";	
       	}
       	
       	@Override
       	protected SiriusTextDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleSiriusFile"
    // InternalSiriusTextDsl.g:68:1: entryRuleSiriusFile returns [EObject current=null] : iv_ruleSiriusFile= ruleSiriusFile EOF ;
    public final EObject entryRuleSiriusFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSiriusFile = null;


        try {
            // InternalSiriusTextDsl.g:69:2: (iv_ruleSiriusFile= ruleSiriusFile EOF )
            // InternalSiriusTextDsl.g:70:2: iv_ruleSiriusFile= ruleSiriusFile EOF
            {
             newCompositeNode(grammarAccess.getSiriusFileRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSiriusFile=ruleSiriusFile();

            state._fsp--;

             current =iv_ruleSiriusFile; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSiriusFile"


    // $ANTLR start "ruleSiriusFile"
    // InternalSiriusTextDsl.g:77:1: ruleSiriusFile returns [EObject current=null] : ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'package' ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_imports_3_0= ruleImport ) )* ( (lv_body_4_0= ruleSiriusFileBody ) ) ) ;
    public final EObject ruleSiriusFile() throws RecognitionException {
        EObject current = null;

        Token lv_documentation_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_imports_3_0 = null;

        EObject lv_body_4_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:80:28: ( ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'package' ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_imports_3_0= ruleImport ) )* ( (lv_body_4_0= ruleSiriusFileBody ) ) ) )
            // InternalSiriusTextDsl.g:81:1: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'package' ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_imports_3_0= ruleImport ) )* ( (lv_body_4_0= ruleSiriusFileBody ) ) )
            {
            // InternalSiriusTextDsl.g:81:1: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'package' ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_imports_3_0= ruleImport ) )* ( (lv_body_4_0= ruleSiriusFileBody ) ) )
            // InternalSiriusTextDsl.g:81:2: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'package' ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_imports_3_0= ruleImport ) )* ( (lv_body_4_0= ruleSiriusFileBody ) )
            {
            // InternalSiriusTextDsl.g:81:2: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_DOCUMENTATION) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalSiriusTextDsl.g:82:1: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    {
                    // InternalSiriusTextDsl.g:82:1: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    // InternalSiriusTextDsl.g:83:3: lv_documentation_0_0= RULE_DOCUMENTATION
                    {
                    lv_documentation_0_0=(Token)match(input,RULE_DOCUMENTATION,FOLLOW_3); 

                    			newLeafNode(lv_documentation_0_0, grammarAccess.getSiriusFileAccess().getDocumentationDOCUMENTATIONTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSiriusFileRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"documentation",
                            		lv_documentation_0_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.DOCUMENTATION");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,10,FOLLOW_4); 

                	newLeafNode(otherlv_1, grammarAccess.getSiriusFileAccess().getPackageKeyword_1());
                
            // InternalSiriusTextDsl.g:103:1: ( (lv_name_2_0= ruleQualifiedName ) )
            // InternalSiriusTextDsl.g:104:1: (lv_name_2_0= ruleQualifiedName )
            {
            // InternalSiriusTextDsl.g:104:1: (lv_name_2_0= ruleQualifiedName )
            // InternalSiriusTextDsl.g:105:3: lv_name_2_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getSiriusFileAccess().getNameQualifiedNameParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_5);
            lv_name_2_0=ruleQualifiedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSiriusFileRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.QualifiedName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalSiriusTextDsl.g:121:2: ( (lv_imports_3_0= ruleImport ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSiriusTextDsl.g:122:1: (lv_imports_3_0= ruleImport )
            	    {
            	    // InternalSiriusTextDsl.g:122:1: (lv_imports_3_0= ruleImport )
            	    // InternalSiriusTextDsl.g:123:3: lv_imports_3_0= ruleImport
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSiriusFileAccess().getImportsImportParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_5);
            	    lv_imports_3_0=ruleImport();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSiriusFileRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"imports",
            	            		lv_imports_3_0, 
            	            		"org.obeonetwork.sirius.text.SiriusTextDsl.Import");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalSiriusTextDsl.g:139:3: ( (lv_body_4_0= ruleSiriusFileBody ) )
            // InternalSiriusTextDsl.g:140:1: (lv_body_4_0= ruleSiriusFileBody )
            {
            // InternalSiriusTextDsl.g:140:1: (lv_body_4_0= ruleSiriusFileBody )
            // InternalSiriusTextDsl.g:141:3: lv_body_4_0= ruleSiriusFileBody
            {
             
            	        newCompositeNode(grammarAccess.getSiriusFileAccess().getBodySiriusFileBodyParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_2);
            lv_body_4_0=ruleSiriusFileBody();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSiriusFileRule());
            	        }
                   		set(
                   			current, 
                   			"body",
                    		lv_body_4_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.SiriusFileBody");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSiriusFile"


    // $ANTLR start "entryRuleSiriusFileBody"
    // InternalSiriusTextDsl.g:165:1: entryRuleSiriusFileBody returns [EObject current=null] : iv_ruleSiriusFileBody= ruleSiriusFileBody EOF ;
    public final EObject entryRuleSiriusFileBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSiriusFileBody = null;


        try {
            // InternalSiriusTextDsl.g:166:2: (iv_ruleSiriusFileBody= ruleSiriusFileBody EOF )
            // InternalSiriusTextDsl.g:167:2: iv_ruleSiriusFileBody= ruleSiriusFileBody EOF
            {
             newCompositeNode(grammarAccess.getSiriusFileBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSiriusFileBody=ruleSiriusFileBody();

            state._fsp--;

             current =iv_ruleSiriusFileBody; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSiriusFileBody"


    // $ANTLR start "ruleSiriusFileBody"
    // InternalSiriusTextDsl.g:174:1: ruleSiriusFileBody returns [EObject current=null] : (this_Designer_0= ruleDesigner | this_Representation_1= ruleRepresentation | this_Layer_2= ruleLayer | this_Mapping_3= ruleMapping | this_Style_4= ruleStyle | this_Palette_5= rulePalette ) ;
    public final EObject ruleSiriusFileBody() throws RecognitionException {
        EObject current = null;

        EObject this_Designer_0 = null;

        EObject this_Representation_1 = null;

        EObject this_Layer_2 = null;

        EObject this_Mapping_3 = null;

        EObject this_Style_4 = null;

        EObject this_Palette_5 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:177:28: ( (this_Designer_0= ruleDesigner | this_Representation_1= ruleRepresentation | this_Layer_2= ruleLayer | this_Mapping_3= ruleMapping | this_Style_4= ruleStyle | this_Palette_5= rulePalette ) )
            // InternalSiriusTextDsl.g:178:1: (this_Designer_0= ruleDesigner | this_Representation_1= ruleRepresentation | this_Layer_2= ruleLayer | this_Mapping_3= ruleMapping | this_Style_4= ruleStyle | this_Palette_5= rulePalette )
            {
            // InternalSiriusTextDsl.g:178:1: (this_Designer_0= ruleDesigner | this_Representation_1= ruleRepresentation | this_Layer_2= ruleLayer | this_Mapping_3= ruleMapping | this_Style_4= ruleStyle | this_Palette_5= rulePalette )
            int alt3=6;
            switch ( input.LA(1) ) {
            case RULE_DOCUMENTATION:
                {
                switch ( input.LA(2) ) {
                case 14:
                    {
                    alt3=1;
                    }
                    break;
                case 48:
                    {
                    alt3=5;
                    }
                    break;
                case 26:
                case 27:
                case 28:
                case 29:
                    {
                    alt3=2;
                    }
                    break;
                case 43:
                case 44:
                    {
                    alt3=4;
                    }
                    break;
                case 57:
                    {
                    alt3=6;
                    }
                    break;
                case 40:
                    {
                    alt3=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }

                }
                break;
            case 14:
                {
                alt3=1;
                }
                break;
            case 26:
            case 27:
            case 28:
            case 29:
                {
                alt3=2;
                }
                break;
            case 40:
                {
                alt3=3;
                }
                break;
            case 43:
            case 44:
                {
                alt3=4;
                }
                break;
            case 48:
                {
                alt3=5;
                }
                break;
            case 57:
                {
                alt3=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalSiriusTextDsl.g:179:5: this_Designer_0= ruleDesigner
                    {
                     
                            newCompositeNode(grammarAccess.getSiriusFileBodyAccess().getDesignerParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Designer_0=ruleDesigner();

                    state._fsp--;

                     
                            current = this_Designer_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalSiriusTextDsl.g:189:5: this_Representation_1= ruleRepresentation
                    {
                     
                            newCompositeNode(grammarAccess.getSiriusFileBodyAccess().getRepresentationParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Representation_1=ruleRepresentation();

                    state._fsp--;

                     
                            current = this_Representation_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalSiriusTextDsl.g:199:5: this_Layer_2= ruleLayer
                    {
                     
                            newCompositeNode(grammarAccess.getSiriusFileBodyAccess().getLayerParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Layer_2=ruleLayer();

                    state._fsp--;

                     
                            current = this_Layer_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // InternalSiriusTextDsl.g:209:5: this_Mapping_3= ruleMapping
                    {
                     
                            newCompositeNode(grammarAccess.getSiriusFileBodyAccess().getMappingParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Mapping_3=ruleMapping();

                    state._fsp--;

                     
                            current = this_Mapping_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // InternalSiriusTextDsl.g:219:5: this_Style_4= ruleStyle
                    {
                     
                            newCompositeNode(grammarAccess.getSiriusFileBodyAccess().getStyleParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Style_4=ruleStyle();

                    state._fsp--;

                     
                            current = this_Style_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // InternalSiriusTextDsl.g:229:5: this_Palette_5= rulePalette
                    {
                     
                            newCompositeNode(grammarAccess.getSiriusFileBodyAccess().getPaletteParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Palette_5=rulePalette();

                    state._fsp--;

                     
                            current = this_Palette_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSiriusFileBody"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalSiriusTextDsl.g:245:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalSiriusTextDsl.g:246:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalSiriusTextDsl.g:247:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalSiriusTextDsl.g:254:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:257:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalSiriusTextDsl.g:258:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalSiriusTextDsl.g:258:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalSiriusTextDsl.g:258:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // InternalSiriusTextDsl.g:265:1: (kw= '.' this_ID_2= RULE_ID )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==11) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSiriusTextDsl.g:266:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,11,FOLLOW_4); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_6); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalSiriusTextDsl.g:286:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalSiriusTextDsl.g:287:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalSiriusTextDsl.g:288:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;

             current =iv_ruleQualifiedNameWithWildcard.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // InternalSiriusTextDsl.g:295:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:298:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // InternalSiriusTextDsl.g:299:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // InternalSiriusTextDsl.g:299:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // InternalSiriusTextDsl.g:300:5: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
             
                    newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                
            pushFollow(FOLLOW_7);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            		current.merge(this_QualifiedName_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // InternalSiriusTextDsl.g:310:1: (kw= '.*' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==12) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSiriusTextDsl.g:311:2: kw= '.*'
                    {
                    kw=(Token)match(input,12,FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleImport"
    // InternalSiriusTextDsl.g:324:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalSiriusTextDsl.g:325:2: (iv_ruleImport= ruleImport EOF )
            // InternalSiriusTextDsl.g:326:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalSiriusTextDsl.g:333:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:336:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // InternalSiriusTextDsl.g:337:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // InternalSiriusTextDsl.g:337:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // InternalSiriusTextDsl.g:337:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_4); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                
            // InternalSiriusTextDsl.g:341:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // InternalSiriusTextDsl.g:342:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // InternalSiriusTextDsl.g:342:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // InternalSiriusTextDsl.g:343:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {
             
            	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_2);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildcard();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getImportRule());
            	        }
                   		set(
                   			current, 
                   			"importedNamespace",
                    		lv_importedNamespace_1_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.QualifiedNameWithWildcard");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleDesigner"
    // InternalSiriusTextDsl.g:367:1: entryRuleDesigner returns [EObject current=null] : iv_ruleDesigner= ruleDesigner EOF ;
    public final EObject entryRuleDesigner() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDesigner = null;


        try {
            // InternalSiriusTextDsl.g:368:2: (iv_ruleDesigner= ruleDesigner EOF )
            // InternalSiriusTextDsl.g:369:2: iv_ruleDesigner= ruleDesigner EOF
            {
             newCompositeNode(grammarAccess.getDesignerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDesigner=ruleDesigner();

            state._fsp--;

             current =iv_ruleDesigner; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDesigner"


    // $ANTLR start "ruleDesigner"
    // InternalSiriusTextDsl.g:376:1: ruleDesigner returns [EObject current=null] : ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'designer' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) ) )? otherlv_5= '{' ( (lv_viewpoints_6_0= ruleViewpoint ) )* otherlv_7= '}' ) ;
    public final EObject ruleDesigner() throws RecognitionException {
        EObject current = null;

        Token lv_documentation_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_label_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_viewpoints_6_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:379:28: ( ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'designer' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) ) )? otherlv_5= '{' ( (lv_viewpoints_6_0= ruleViewpoint ) )* otherlv_7= '}' ) )
            // InternalSiriusTextDsl.g:380:1: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'designer' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) ) )? otherlv_5= '{' ( (lv_viewpoints_6_0= ruleViewpoint ) )* otherlv_7= '}' )
            {
            // InternalSiriusTextDsl.g:380:1: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'designer' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) ) )? otherlv_5= '{' ( (lv_viewpoints_6_0= ruleViewpoint ) )* otherlv_7= '}' )
            // InternalSiriusTextDsl.g:380:2: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'designer' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) ) )? otherlv_5= '{' ( (lv_viewpoints_6_0= ruleViewpoint ) )* otherlv_7= '}'
            {
            // InternalSiriusTextDsl.g:380:2: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_DOCUMENTATION) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSiriusTextDsl.g:381:1: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    {
                    // InternalSiriusTextDsl.g:381:1: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    // InternalSiriusTextDsl.g:382:3: lv_documentation_0_0= RULE_DOCUMENTATION
                    {
                    lv_documentation_0_0=(Token)match(input,RULE_DOCUMENTATION,FOLLOW_8); 

                    			newLeafNode(lv_documentation_0_0, grammarAccess.getDesignerAccess().getDocumentationDOCUMENTATIONTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDesignerRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"documentation",
                            		lv_documentation_0_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.DOCUMENTATION");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,14,FOLLOW_4); 

                	newLeafNode(otherlv_1, grammarAccess.getDesignerAccess().getDesignerKeyword_1());
                
            // InternalSiriusTextDsl.g:402:1: ( (lv_name_2_0= RULE_ID ) )
            // InternalSiriusTextDsl.g:403:1: (lv_name_2_0= RULE_ID )
            {
            // InternalSiriusTextDsl.g:403:1: (lv_name_2_0= RULE_ID )
            // InternalSiriusTextDsl.g:404:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            			newLeafNode(lv_name_2_0, grammarAccess.getDesignerAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDesignerRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.ID");
            	    

            }


            }

            // InternalSiriusTextDsl.g:420:2: (otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSiriusTextDsl.g:420:4: otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_10); 

                        	newLeafNode(otherlv_3, grammarAccess.getDesignerAccess().getAsKeyword_3_0());
                        
                    // InternalSiriusTextDsl.g:424:1: ( (lv_label_4_0= RULE_STRING ) )
                    // InternalSiriusTextDsl.g:425:1: (lv_label_4_0= RULE_STRING )
                    {
                    // InternalSiriusTextDsl.g:425:1: (lv_label_4_0= RULE_STRING )
                    // InternalSiriusTextDsl.g:426:3: lv_label_4_0= RULE_STRING
                    {
                    lv_label_4_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

                    			newLeafNode(lv_label_4_0, grammarAccess.getDesignerAccess().getLabelSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDesignerRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"label",
                            		lv_label_4_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,16,FOLLOW_12); 

                	newLeafNode(otherlv_5, grammarAccess.getDesignerAccess().getLeftCurlyBracketKeyword_4());
                
            // InternalSiriusTextDsl.g:446:1: ( (lv_viewpoints_6_0= ruleViewpoint ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_DOCUMENTATION||LA8_0==18) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSiriusTextDsl.g:447:1: (lv_viewpoints_6_0= ruleViewpoint )
            	    {
            	    // InternalSiriusTextDsl.g:447:1: (lv_viewpoints_6_0= ruleViewpoint )
            	    // InternalSiriusTextDsl.g:448:3: lv_viewpoints_6_0= ruleViewpoint
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDesignerAccess().getViewpointsViewpointParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_12);
            	    lv_viewpoints_6_0=ruleViewpoint();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDesignerRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"viewpoints",
            	            		lv_viewpoints_6_0, 
            	            		"org.obeonetwork.sirius.text.SiriusTextDsl.Viewpoint");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_7=(Token)match(input,17,FOLLOW_2); 

                	newLeafNode(otherlv_7, grammarAccess.getDesignerAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDesigner"


    // $ANTLR start "entryRuleViewpoint"
    // InternalSiriusTextDsl.g:476:1: entryRuleViewpoint returns [EObject current=null] : iv_ruleViewpoint= ruleViewpoint EOF ;
    public final EObject entryRuleViewpoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleViewpoint = null;


        try {
            // InternalSiriusTextDsl.g:477:2: (iv_ruleViewpoint= ruleViewpoint EOF )
            // InternalSiriusTextDsl.g:478:2: iv_ruleViewpoint= ruleViewpoint EOF
            {
             newCompositeNode(grammarAccess.getViewpointRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleViewpoint=ruleViewpoint();

            state._fsp--;

             current =iv_ruleViewpoint; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleViewpoint"


    // $ANTLR start "ruleViewpoint"
    // InternalSiriusTextDsl.g:485:1: ruleViewpoint returns [EObject current=null] : ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'viewpoint' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) ) )? otherlv_5= '{' (otherlv_6= 'modelFileExtensions' otherlv_7= '=' otherlv_8= '[' ( (lv_modelFileExtensions_9_0= RULE_STRING ) ) (otherlv_10= ',' ( (lv_modelFileExtensions_11_0= RULE_STRING ) ) )* otherlv_12= ']' )? (otherlv_13= 'icon' otherlv_14= '=' ( (lv_icon_15_0= RULE_STRING ) ) )? (otherlv_16= 'representations' otherlv_17= '=' otherlv_18= '[' ( ( ( ruleQualifiedName ) ) (otherlv_20= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_22= ']' )? otherlv_23= '}' ) ;
    public final EObject ruleViewpoint() throws RecognitionException {
        EObject current = null;

        Token lv_documentation_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_label_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_modelFileExtensions_9_0=null;
        Token otherlv_10=null;
        Token lv_modelFileExtensions_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token lv_icon_15_0=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;

         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:488:28: ( ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'viewpoint' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) ) )? otherlv_5= '{' (otherlv_6= 'modelFileExtensions' otherlv_7= '=' otherlv_8= '[' ( (lv_modelFileExtensions_9_0= RULE_STRING ) ) (otherlv_10= ',' ( (lv_modelFileExtensions_11_0= RULE_STRING ) ) )* otherlv_12= ']' )? (otherlv_13= 'icon' otherlv_14= '=' ( (lv_icon_15_0= RULE_STRING ) ) )? (otherlv_16= 'representations' otherlv_17= '=' otherlv_18= '[' ( ( ( ruleQualifiedName ) ) (otherlv_20= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_22= ']' )? otherlv_23= '}' ) )
            // InternalSiriusTextDsl.g:489:1: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'viewpoint' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) ) )? otherlv_5= '{' (otherlv_6= 'modelFileExtensions' otherlv_7= '=' otherlv_8= '[' ( (lv_modelFileExtensions_9_0= RULE_STRING ) ) (otherlv_10= ',' ( (lv_modelFileExtensions_11_0= RULE_STRING ) ) )* otherlv_12= ']' )? (otherlv_13= 'icon' otherlv_14= '=' ( (lv_icon_15_0= RULE_STRING ) ) )? (otherlv_16= 'representations' otherlv_17= '=' otherlv_18= '[' ( ( ( ruleQualifiedName ) ) (otherlv_20= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_22= ']' )? otherlv_23= '}' )
            {
            // InternalSiriusTextDsl.g:489:1: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'viewpoint' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) ) )? otherlv_5= '{' (otherlv_6= 'modelFileExtensions' otherlv_7= '=' otherlv_8= '[' ( (lv_modelFileExtensions_9_0= RULE_STRING ) ) (otherlv_10= ',' ( (lv_modelFileExtensions_11_0= RULE_STRING ) ) )* otherlv_12= ']' )? (otherlv_13= 'icon' otherlv_14= '=' ( (lv_icon_15_0= RULE_STRING ) ) )? (otherlv_16= 'representations' otherlv_17= '=' otherlv_18= '[' ( ( ( ruleQualifiedName ) ) (otherlv_20= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_22= ']' )? otherlv_23= '}' )
            // InternalSiriusTextDsl.g:489:2: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'viewpoint' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) ) )? otherlv_5= '{' (otherlv_6= 'modelFileExtensions' otherlv_7= '=' otherlv_8= '[' ( (lv_modelFileExtensions_9_0= RULE_STRING ) ) (otherlv_10= ',' ( (lv_modelFileExtensions_11_0= RULE_STRING ) ) )* otherlv_12= ']' )? (otherlv_13= 'icon' otherlv_14= '=' ( (lv_icon_15_0= RULE_STRING ) ) )? (otherlv_16= 'representations' otherlv_17= '=' otherlv_18= '[' ( ( ( ruleQualifiedName ) ) (otherlv_20= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_22= ']' )? otherlv_23= '}'
            {
            // InternalSiriusTextDsl.g:489:2: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_DOCUMENTATION) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSiriusTextDsl.g:490:1: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    {
                    // InternalSiriusTextDsl.g:490:1: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    // InternalSiriusTextDsl.g:491:3: lv_documentation_0_0= RULE_DOCUMENTATION
                    {
                    lv_documentation_0_0=(Token)match(input,RULE_DOCUMENTATION,FOLLOW_13); 

                    			newLeafNode(lv_documentation_0_0, grammarAccess.getViewpointAccess().getDocumentationDOCUMENTATIONTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getViewpointRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"documentation",
                            		lv_documentation_0_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.DOCUMENTATION");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,18,FOLLOW_4); 

                	newLeafNode(otherlv_1, grammarAccess.getViewpointAccess().getViewpointKeyword_1());
                
            // InternalSiriusTextDsl.g:511:1: ( (lv_name_2_0= RULE_ID ) )
            // InternalSiriusTextDsl.g:512:1: (lv_name_2_0= RULE_ID )
            {
            // InternalSiriusTextDsl.g:512:1: (lv_name_2_0= RULE_ID )
            // InternalSiriusTextDsl.g:513:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            			newLeafNode(lv_name_2_0, grammarAccess.getViewpointAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getViewpointRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.ID");
            	    

            }


            }

            // InternalSiriusTextDsl.g:529:2: (otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==15) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSiriusTextDsl.g:529:4: otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_10); 

                        	newLeafNode(otherlv_3, grammarAccess.getViewpointAccess().getAsKeyword_3_0());
                        
                    // InternalSiriusTextDsl.g:533:1: ( (lv_label_4_0= RULE_STRING ) )
                    // InternalSiriusTextDsl.g:534:1: (lv_label_4_0= RULE_STRING )
                    {
                    // InternalSiriusTextDsl.g:534:1: (lv_label_4_0= RULE_STRING )
                    // InternalSiriusTextDsl.g:535:3: lv_label_4_0= RULE_STRING
                    {
                    lv_label_4_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

                    			newLeafNode(lv_label_4_0, grammarAccess.getViewpointAccess().getLabelSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getViewpointRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"label",
                            		lv_label_4_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,16,FOLLOW_14); 

                	newLeafNode(otherlv_5, grammarAccess.getViewpointAccess().getLeftCurlyBracketKeyword_4());
                
            // InternalSiriusTextDsl.g:555:1: (otherlv_6= 'modelFileExtensions' otherlv_7= '=' otherlv_8= '[' ( (lv_modelFileExtensions_9_0= RULE_STRING ) ) (otherlv_10= ',' ( (lv_modelFileExtensions_11_0= RULE_STRING ) ) )* otherlv_12= ']' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==19) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSiriusTextDsl.g:555:3: otherlv_6= 'modelFileExtensions' otherlv_7= '=' otherlv_8= '[' ( (lv_modelFileExtensions_9_0= RULE_STRING ) ) (otherlv_10= ',' ( (lv_modelFileExtensions_11_0= RULE_STRING ) ) )* otherlv_12= ']'
                    {
                    otherlv_6=(Token)match(input,19,FOLLOW_15); 

                        	newLeafNode(otherlv_6, grammarAccess.getViewpointAccess().getModelFileExtensionsKeyword_5_0());
                        
                    otherlv_7=(Token)match(input,20,FOLLOW_16); 

                        	newLeafNode(otherlv_7, grammarAccess.getViewpointAccess().getEqualsSignKeyword_5_1());
                        
                    otherlv_8=(Token)match(input,21,FOLLOW_10); 

                        	newLeafNode(otherlv_8, grammarAccess.getViewpointAccess().getLeftSquareBracketKeyword_5_2());
                        
                    // InternalSiriusTextDsl.g:567:1: ( (lv_modelFileExtensions_9_0= RULE_STRING ) )
                    // InternalSiriusTextDsl.g:568:1: (lv_modelFileExtensions_9_0= RULE_STRING )
                    {
                    // InternalSiriusTextDsl.g:568:1: (lv_modelFileExtensions_9_0= RULE_STRING )
                    // InternalSiriusTextDsl.g:569:3: lv_modelFileExtensions_9_0= RULE_STRING
                    {
                    lv_modelFileExtensions_9_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

                    			newLeafNode(lv_modelFileExtensions_9_0, grammarAccess.getViewpointAccess().getModelFileExtensionsSTRINGTerminalRuleCall_5_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getViewpointRule());
                    	        }
                           		addWithLastConsumed(
                           			current, 
                           			"modelFileExtensions",
                            		lv_modelFileExtensions_9_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
                    	    

                    }


                    }

                    // InternalSiriusTextDsl.g:585:2: (otherlv_10= ',' ( (lv_modelFileExtensions_11_0= RULE_STRING ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==22) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalSiriusTextDsl.g:585:4: otherlv_10= ',' ( (lv_modelFileExtensions_11_0= RULE_STRING ) )
                    	    {
                    	    otherlv_10=(Token)match(input,22,FOLLOW_10); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getViewpointAccess().getCommaKeyword_5_4_0());
                    	        
                    	    // InternalSiriusTextDsl.g:589:1: ( (lv_modelFileExtensions_11_0= RULE_STRING ) )
                    	    // InternalSiriusTextDsl.g:590:1: (lv_modelFileExtensions_11_0= RULE_STRING )
                    	    {
                    	    // InternalSiriusTextDsl.g:590:1: (lv_modelFileExtensions_11_0= RULE_STRING )
                    	    // InternalSiriusTextDsl.g:591:3: lv_modelFileExtensions_11_0= RULE_STRING
                    	    {
                    	    lv_modelFileExtensions_11_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

                    	    			newLeafNode(lv_modelFileExtensions_11_0, grammarAccess.getViewpointAccess().getModelFileExtensionsSTRINGTerminalRuleCall_5_4_1_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getViewpointRule());
                    	    	        }
                    	           		addWithLastConsumed(
                    	           			current, 
                    	           			"modelFileExtensions",
                    	            		lv_modelFileExtensions_11_0, 
                    	            		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,23,FOLLOW_18); 

                        	newLeafNode(otherlv_12, grammarAccess.getViewpointAccess().getRightSquareBracketKeyword_5_5());
                        

                    }
                    break;

            }

            // InternalSiriusTextDsl.g:611:3: (otherlv_13= 'icon' otherlv_14= '=' ( (lv_icon_15_0= RULE_STRING ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSiriusTextDsl.g:611:5: otherlv_13= 'icon' otherlv_14= '=' ( (lv_icon_15_0= RULE_STRING ) )
                    {
                    otherlv_13=(Token)match(input,24,FOLLOW_15); 

                        	newLeafNode(otherlv_13, grammarAccess.getViewpointAccess().getIconKeyword_6_0());
                        
                    otherlv_14=(Token)match(input,20,FOLLOW_10); 

                        	newLeafNode(otherlv_14, grammarAccess.getViewpointAccess().getEqualsSignKeyword_6_1());
                        
                    // InternalSiriusTextDsl.g:619:1: ( (lv_icon_15_0= RULE_STRING ) )
                    // InternalSiriusTextDsl.g:620:1: (lv_icon_15_0= RULE_STRING )
                    {
                    // InternalSiriusTextDsl.g:620:1: (lv_icon_15_0= RULE_STRING )
                    // InternalSiriusTextDsl.g:621:3: lv_icon_15_0= RULE_STRING
                    {
                    lv_icon_15_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

                    			newLeafNode(lv_icon_15_0, grammarAccess.getViewpointAccess().getIconSTRINGTerminalRuleCall_6_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getViewpointRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"icon",
                            		lv_icon_15_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:637:4: (otherlv_16= 'representations' otherlv_17= '=' otherlv_18= '[' ( ( ( ruleQualifiedName ) ) (otherlv_20= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_22= ']' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==25) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSiriusTextDsl.g:637:6: otherlv_16= 'representations' otherlv_17= '=' otherlv_18= '[' ( ( ( ruleQualifiedName ) ) (otherlv_20= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_22= ']'
                    {
                    otherlv_16=(Token)match(input,25,FOLLOW_15); 

                        	newLeafNode(otherlv_16, grammarAccess.getViewpointAccess().getRepresentationsKeyword_7_0());
                        
                    otherlv_17=(Token)match(input,20,FOLLOW_16); 

                        	newLeafNode(otherlv_17, grammarAccess.getViewpointAccess().getEqualsSignKeyword_7_1());
                        
                    otherlv_18=(Token)match(input,21,FOLLOW_20); 

                        	newLeafNode(otherlv_18, grammarAccess.getViewpointAccess().getLeftSquareBracketKeyword_7_2());
                        
                    // InternalSiriusTextDsl.g:649:1: ( ( ( ruleQualifiedName ) ) (otherlv_20= ',' ( ( ruleQualifiedName ) ) )* )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==RULE_ID) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalSiriusTextDsl.g:649:2: ( ( ruleQualifiedName ) ) (otherlv_20= ',' ( ( ruleQualifiedName ) ) )*
                            {
                            // InternalSiriusTextDsl.g:649:2: ( ( ruleQualifiedName ) )
                            // InternalSiriusTextDsl.g:650:1: ( ruleQualifiedName )
                            {
                            // InternalSiriusTextDsl.g:650:1: ( ruleQualifiedName )
                            // InternalSiriusTextDsl.g:651:3: ruleQualifiedName
                            {

                            			if (current==null) {
                            	            current = createModelElement(grammarAccess.getViewpointRule());
                            	        }
                                    
                             
                            	        newCompositeNode(grammarAccess.getViewpointAccess().getRepresentationsRepresentationCrossReference_7_3_0_0()); 
                            	    
                            pushFollow(FOLLOW_17);
                            ruleQualifiedName();

                            state._fsp--;

                             
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // InternalSiriusTextDsl.g:664:2: (otherlv_20= ',' ( ( ruleQualifiedName ) ) )*
                            loop14:
                            do {
                                int alt14=2;
                                int LA14_0 = input.LA(1);

                                if ( (LA14_0==22) ) {
                                    alt14=1;
                                }


                                switch (alt14) {
                            	case 1 :
                            	    // InternalSiriusTextDsl.g:664:4: otherlv_20= ',' ( ( ruleQualifiedName ) )
                            	    {
                            	    otherlv_20=(Token)match(input,22,FOLLOW_4); 

                            	        	newLeafNode(otherlv_20, grammarAccess.getViewpointAccess().getCommaKeyword_7_3_1_0());
                            	        
                            	    // InternalSiriusTextDsl.g:668:1: ( ( ruleQualifiedName ) )
                            	    // InternalSiriusTextDsl.g:669:1: ( ruleQualifiedName )
                            	    {
                            	    // InternalSiriusTextDsl.g:669:1: ( ruleQualifiedName )
                            	    // InternalSiriusTextDsl.g:670:3: ruleQualifiedName
                            	    {

                            	    			if (current==null) {
                            	    	            current = createModelElement(grammarAccess.getViewpointRule());
                            	    	        }
                            	            
                            	     
                            	    	        newCompositeNode(grammarAccess.getViewpointAccess().getRepresentationsRepresentationCrossReference_7_3_1_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_17);
                            	    ruleQualifiedName();

                            	    state._fsp--;

                            	     
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop14;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_22=(Token)match(input,23,FOLLOW_21); 

                        	newLeafNode(otherlv_22, grammarAccess.getViewpointAccess().getRightSquareBracketKeyword_7_4());
                        

                    }
                    break;

            }

            otherlv_23=(Token)match(input,17,FOLLOW_2); 

                	newLeafNode(otherlv_23, grammarAccess.getViewpointAccess().getRightCurlyBracketKeyword_8());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleViewpoint"


    // $ANTLR start "entryRuleRepresentation"
    // InternalSiriusTextDsl.g:699:1: entryRuleRepresentation returns [EObject current=null] : iv_ruleRepresentation= ruleRepresentation EOF ;
    public final EObject entryRuleRepresentation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepresentation = null;


        try {
            // InternalSiriusTextDsl.g:700:2: (iv_ruleRepresentation= ruleRepresentation EOF )
            // InternalSiriusTextDsl.g:701:2: iv_ruleRepresentation= ruleRepresentation EOF
            {
             newCompositeNode(grammarAccess.getRepresentationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRepresentation=ruleRepresentation();

            state._fsp--;

             current =iv_ruleRepresentation; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRepresentation"


    // $ANTLR start "ruleRepresentation"
    // InternalSiriusTextDsl.g:708:1: ruleRepresentation returns [EObject current=null] : this_Diagram_0= ruleDiagram ;
    public final EObject ruleRepresentation() throws RecognitionException {
        EObject current = null;

        EObject this_Diagram_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:711:28: (this_Diagram_0= ruleDiagram )
            // InternalSiriusTextDsl.g:713:5: this_Diagram_0= ruleDiagram
            {
             
                    newCompositeNode(grammarAccess.getRepresentationAccess().getDiagramParserRuleCall()); 
                
            pushFollow(FOLLOW_2);
            this_Diagram_0=ruleDiagram();

            state._fsp--;

             
                    current = this_Diagram_0; 
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRepresentation"


    // $ANTLR start "entryRuleDiagram"
    // InternalSiriusTextDsl.g:729:1: entryRuleDiagram returns [EObject current=null] : iv_ruleDiagram= ruleDiagram EOF ;
    public final EObject entryRuleDiagram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiagram = null;


        try {
            // InternalSiriusTextDsl.g:730:2: (iv_ruleDiagram= ruleDiagram EOF )
            // InternalSiriusTextDsl.g:731:2: iv_ruleDiagram= ruleDiagram EOF
            {
             newCompositeNode(grammarAccess.getDiagramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDiagram=ruleDiagram();

            state._fsp--;

             current =iv_ruleDiagram; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDiagram"


    // $ANTLR start "ruleDiagram"
    // InternalSiriusTextDsl.g:738:1: ruleDiagram returns [EObject current=null] : ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? ( (lv_initialized_1_0= '@Initialized' ) )? ( (lv_showOnStartup_2_0= '@ShowOnStartup' ) )? ( (lv_enablePopupBars_3_0= '@EnablePopupBars' ) )? (otherlv_4= '@MetamodelUris' )+ otherlv_5= '({' ( (lv_metamodelUris_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_metamodelUris_8_0= RULE_STRING ) ) )* otherlv_9= '})' otherlv_10= 'diagram' ( (lv_name_11_0= RULE_ID ) ) (otherlv_12= 'as' ( (lv_label_13_0= RULE_STRING ) ) )? otherlv_14= 'for' ( (lv_domainClass_15_0= RULE_STRING ) ) (otherlv_16= '?' ( (lv_precondition_17_0= RULE_EXPRESSION ) ) )? otherlv_18= '{' (otherlv_19= 'documentation' otherlv_20= '=' ( (lv_endUserDocumentation_21_0= RULE_STRING ) ) )? (otherlv_22= 'titleExpression' otherlv_23= '=' ( (lv_titleExpression_24_0= RULE_EXPRESSION ) ) )? (otherlv_25= 'rootExpression' otherlv_26= '=' ( (lv_rootExpression_27_0= RULE_EXPRESSION ) ) )? (otherlv_28= 'defaultLayer' otherlv_29= '=' ( ( ruleQualifiedName ) ) )? (otherlv_31= 'additionalLayers' otherlv_32= '=' otherlv_33= '[' ( ( ( ruleQualifiedName ) ) (otherlv_35= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_37= ']' )? otherlv_38= '}' ) ;
    public final EObject ruleDiagram() throws RecognitionException {
        EObject current = null;

        Token lv_documentation_0_0=null;
        Token lv_initialized_1_0=null;
        Token lv_showOnStartup_2_0=null;
        Token lv_enablePopupBars_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_metamodelUris_6_0=null;
        Token otherlv_7=null;
        Token lv_metamodelUris_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_name_11_0=null;
        Token otherlv_12=null;
        Token lv_label_13_0=null;
        Token otherlv_14=null;
        Token lv_domainClass_15_0=null;
        Token otherlv_16=null;
        Token lv_precondition_17_0=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token lv_endUserDocumentation_21_0=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token lv_titleExpression_24_0=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token lv_rootExpression_27_0=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_35=null;
        Token otherlv_37=null;
        Token otherlv_38=null;

         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:741:28: ( ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? ( (lv_initialized_1_0= '@Initialized' ) )? ( (lv_showOnStartup_2_0= '@ShowOnStartup' ) )? ( (lv_enablePopupBars_3_0= '@EnablePopupBars' ) )? (otherlv_4= '@MetamodelUris' )+ otherlv_5= '({' ( (lv_metamodelUris_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_metamodelUris_8_0= RULE_STRING ) ) )* otherlv_9= '})' otherlv_10= 'diagram' ( (lv_name_11_0= RULE_ID ) ) (otherlv_12= 'as' ( (lv_label_13_0= RULE_STRING ) ) )? otherlv_14= 'for' ( (lv_domainClass_15_0= RULE_STRING ) ) (otherlv_16= '?' ( (lv_precondition_17_0= RULE_EXPRESSION ) ) )? otherlv_18= '{' (otherlv_19= 'documentation' otherlv_20= '=' ( (lv_endUserDocumentation_21_0= RULE_STRING ) ) )? (otherlv_22= 'titleExpression' otherlv_23= '=' ( (lv_titleExpression_24_0= RULE_EXPRESSION ) ) )? (otherlv_25= 'rootExpression' otherlv_26= '=' ( (lv_rootExpression_27_0= RULE_EXPRESSION ) ) )? (otherlv_28= 'defaultLayer' otherlv_29= '=' ( ( ruleQualifiedName ) ) )? (otherlv_31= 'additionalLayers' otherlv_32= '=' otherlv_33= '[' ( ( ( ruleQualifiedName ) ) (otherlv_35= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_37= ']' )? otherlv_38= '}' ) )
            // InternalSiriusTextDsl.g:742:1: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? ( (lv_initialized_1_0= '@Initialized' ) )? ( (lv_showOnStartup_2_0= '@ShowOnStartup' ) )? ( (lv_enablePopupBars_3_0= '@EnablePopupBars' ) )? (otherlv_4= '@MetamodelUris' )+ otherlv_5= '({' ( (lv_metamodelUris_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_metamodelUris_8_0= RULE_STRING ) ) )* otherlv_9= '})' otherlv_10= 'diagram' ( (lv_name_11_0= RULE_ID ) ) (otherlv_12= 'as' ( (lv_label_13_0= RULE_STRING ) ) )? otherlv_14= 'for' ( (lv_domainClass_15_0= RULE_STRING ) ) (otherlv_16= '?' ( (lv_precondition_17_0= RULE_EXPRESSION ) ) )? otherlv_18= '{' (otherlv_19= 'documentation' otherlv_20= '=' ( (lv_endUserDocumentation_21_0= RULE_STRING ) ) )? (otherlv_22= 'titleExpression' otherlv_23= '=' ( (lv_titleExpression_24_0= RULE_EXPRESSION ) ) )? (otherlv_25= 'rootExpression' otherlv_26= '=' ( (lv_rootExpression_27_0= RULE_EXPRESSION ) ) )? (otherlv_28= 'defaultLayer' otherlv_29= '=' ( ( ruleQualifiedName ) ) )? (otherlv_31= 'additionalLayers' otherlv_32= '=' otherlv_33= '[' ( ( ( ruleQualifiedName ) ) (otherlv_35= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_37= ']' )? otherlv_38= '}' )
            {
            // InternalSiriusTextDsl.g:742:1: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? ( (lv_initialized_1_0= '@Initialized' ) )? ( (lv_showOnStartup_2_0= '@ShowOnStartup' ) )? ( (lv_enablePopupBars_3_0= '@EnablePopupBars' ) )? (otherlv_4= '@MetamodelUris' )+ otherlv_5= '({' ( (lv_metamodelUris_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_metamodelUris_8_0= RULE_STRING ) ) )* otherlv_9= '})' otherlv_10= 'diagram' ( (lv_name_11_0= RULE_ID ) ) (otherlv_12= 'as' ( (lv_label_13_0= RULE_STRING ) ) )? otherlv_14= 'for' ( (lv_domainClass_15_0= RULE_STRING ) ) (otherlv_16= '?' ( (lv_precondition_17_0= RULE_EXPRESSION ) ) )? otherlv_18= '{' (otherlv_19= 'documentation' otherlv_20= '=' ( (lv_endUserDocumentation_21_0= RULE_STRING ) ) )? (otherlv_22= 'titleExpression' otherlv_23= '=' ( (lv_titleExpression_24_0= RULE_EXPRESSION ) ) )? (otherlv_25= 'rootExpression' otherlv_26= '=' ( (lv_rootExpression_27_0= RULE_EXPRESSION ) ) )? (otherlv_28= 'defaultLayer' otherlv_29= '=' ( ( ruleQualifiedName ) ) )? (otherlv_31= 'additionalLayers' otherlv_32= '=' otherlv_33= '[' ( ( ( ruleQualifiedName ) ) (otherlv_35= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_37= ']' )? otherlv_38= '}' )
            // InternalSiriusTextDsl.g:742:2: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? ( (lv_initialized_1_0= '@Initialized' ) )? ( (lv_showOnStartup_2_0= '@ShowOnStartup' ) )? ( (lv_enablePopupBars_3_0= '@EnablePopupBars' ) )? (otherlv_4= '@MetamodelUris' )+ otherlv_5= '({' ( (lv_metamodelUris_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_metamodelUris_8_0= RULE_STRING ) ) )* otherlv_9= '})' otherlv_10= 'diagram' ( (lv_name_11_0= RULE_ID ) ) (otherlv_12= 'as' ( (lv_label_13_0= RULE_STRING ) ) )? otherlv_14= 'for' ( (lv_domainClass_15_0= RULE_STRING ) ) (otherlv_16= '?' ( (lv_precondition_17_0= RULE_EXPRESSION ) ) )? otherlv_18= '{' (otherlv_19= 'documentation' otherlv_20= '=' ( (lv_endUserDocumentation_21_0= RULE_STRING ) ) )? (otherlv_22= 'titleExpression' otherlv_23= '=' ( (lv_titleExpression_24_0= RULE_EXPRESSION ) ) )? (otherlv_25= 'rootExpression' otherlv_26= '=' ( (lv_rootExpression_27_0= RULE_EXPRESSION ) ) )? (otherlv_28= 'defaultLayer' otherlv_29= '=' ( ( ruleQualifiedName ) ) )? (otherlv_31= 'additionalLayers' otherlv_32= '=' otherlv_33= '[' ( ( ( ruleQualifiedName ) ) (otherlv_35= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_37= ']' )? otherlv_38= '}'
            {
            // InternalSiriusTextDsl.g:742:2: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_DOCUMENTATION) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSiriusTextDsl.g:743:1: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    {
                    // InternalSiriusTextDsl.g:743:1: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    // InternalSiriusTextDsl.g:744:3: lv_documentation_0_0= RULE_DOCUMENTATION
                    {
                    lv_documentation_0_0=(Token)match(input,RULE_DOCUMENTATION,FOLLOW_22); 

                    			newLeafNode(lv_documentation_0_0, grammarAccess.getDiagramAccess().getDocumentationDOCUMENTATIONTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDiagramRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"documentation",
                            		lv_documentation_0_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.DOCUMENTATION");
                    	    

                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:760:3: ( (lv_initialized_1_0= '@Initialized' ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==26) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalSiriusTextDsl.g:761:1: (lv_initialized_1_0= '@Initialized' )
                    {
                    // InternalSiriusTextDsl.g:761:1: (lv_initialized_1_0= '@Initialized' )
                    // InternalSiriusTextDsl.g:762:3: lv_initialized_1_0= '@Initialized'
                    {
                    lv_initialized_1_0=(Token)match(input,26,FOLLOW_23); 

                            newLeafNode(lv_initialized_1_0, grammarAccess.getDiagramAccess().getInitializedInitializedKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDiagramRule());
                    	        }
                           		setWithLastConsumed(current, "initialized", true, "@Initialized");
                    	    

                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:775:3: ( (lv_showOnStartup_2_0= '@ShowOnStartup' ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==27) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSiriusTextDsl.g:776:1: (lv_showOnStartup_2_0= '@ShowOnStartup' )
                    {
                    // InternalSiriusTextDsl.g:776:1: (lv_showOnStartup_2_0= '@ShowOnStartup' )
                    // InternalSiriusTextDsl.g:777:3: lv_showOnStartup_2_0= '@ShowOnStartup'
                    {
                    lv_showOnStartup_2_0=(Token)match(input,27,FOLLOW_24); 

                            newLeafNode(lv_showOnStartup_2_0, grammarAccess.getDiagramAccess().getShowOnStartupShowOnStartupKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDiagramRule());
                    	        }
                           		setWithLastConsumed(current, "showOnStartup", true, "@ShowOnStartup");
                    	    

                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:790:3: ( (lv_enablePopupBars_3_0= '@EnablePopupBars' ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==28) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalSiriusTextDsl.g:791:1: (lv_enablePopupBars_3_0= '@EnablePopupBars' )
                    {
                    // InternalSiriusTextDsl.g:791:1: (lv_enablePopupBars_3_0= '@EnablePopupBars' )
                    // InternalSiriusTextDsl.g:792:3: lv_enablePopupBars_3_0= '@EnablePopupBars'
                    {
                    lv_enablePopupBars_3_0=(Token)match(input,28,FOLLOW_25); 

                            newLeafNode(lv_enablePopupBars_3_0, grammarAccess.getDiagramAccess().getEnablePopupBarsEnablePopupBarsKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDiagramRule());
                    	        }
                           		setWithLastConsumed(current, "enablePopupBars", true, "@EnablePopupBars");
                    	    

                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:805:3: (otherlv_4= '@MetamodelUris' )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==29) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalSiriusTextDsl.g:805:5: otherlv_4= '@MetamodelUris'
            	    {
            	    otherlv_4=(Token)match(input,29,FOLLOW_26); 

            	        	newLeafNode(otherlv_4, grammarAccess.getDiagramAccess().getMetamodelUrisKeyword_4());
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);

            otherlv_5=(Token)match(input,30,FOLLOW_10); 

                	newLeafNode(otherlv_5, grammarAccess.getDiagramAccess().getLeftParenthesisLeftCurlyBracketKeyword_5());
                
            // InternalSiriusTextDsl.g:813:1: ( (lv_metamodelUris_6_0= RULE_STRING ) )
            // InternalSiriusTextDsl.g:814:1: (lv_metamodelUris_6_0= RULE_STRING )
            {
            // InternalSiriusTextDsl.g:814:1: (lv_metamodelUris_6_0= RULE_STRING )
            // InternalSiriusTextDsl.g:815:3: lv_metamodelUris_6_0= RULE_STRING
            {
            lv_metamodelUris_6_0=(Token)match(input,RULE_STRING,FOLLOW_27); 

            			newLeafNode(lv_metamodelUris_6_0, grammarAccess.getDiagramAccess().getMetamodelUrisSTRINGTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDiagramRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"metamodelUris",
                    		lv_metamodelUris_6_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
            	    

            }


            }

            // InternalSiriusTextDsl.g:831:2: (otherlv_7= ',' ( (lv_metamodelUris_8_0= RULE_STRING ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==22) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalSiriusTextDsl.g:831:4: otherlv_7= ',' ( (lv_metamodelUris_8_0= RULE_STRING ) )
            	    {
            	    otherlv_7=(Token)match(input,22,FOLLOW_10); 

            	        	newLeafNode(otherlv_7, grammarAccess.getDiagramAccess().getCommaKeyword_7_0());
            	        
            	    // InternalSiriusTextDsl.g:835:1: ( (lv_metamodelUris_8_0= RULE_STRING ) )
            	    // InternalSiriusTextDsl.g:836:1: (lv_metamodelUris_8_0= RULE_STRING )
            	    {
            	    // InternalSiriusTextDsl.g:836:1: (lv_metamodelUris_8_0= RULE_STRING )
            	    // InternalSiriusTextDsl.g:837:3: lv_metamodelUris_8_0= RULE_STRING
            	    {
            	    lv_metamodelUris_8_0=(Token)match(input,RULE_STRING,FOLLOW_27); 

            	    			newLeafNode(lv_metamodelUris_8_0, grammarAccess.getDiagramAccess().getMetamodelUrisSTRINGTerminalRuleCall_7_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getDiagramRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"metamodelUris",
            	            		lv_metamodelUris_8_0, 
            	            		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            otherlv_9=(Token)match(input,31,FOLLOW_28); 

                	newLeafNode(otherlv_9, grammarAccess.getDiagramAccess().getRightCurlyBracketRightParenthesisKeyword_8());
                
            otherlv_10=(Token)match(input,32,FOLLOW_4); 

                	newLeafNode(otherlv_10, grammarAccess.getDiagramAccess().getDiagramKeyword_9());
                
            // InternalSiriusTextDsl.g:861:1: ( (lv_name_11_0= RULE_ID ) )
            // InternalSiriusTextDsl.g:862:1: (lv_name_11_0= RULE_ID )
            {
            // InternalSiriusTextDsl.g:862:1: (lv_name_11_0= RULE_ID )
            // InternalSiriusTextDsl.g:863:3: lv_name_11_0= RULE_ID
            {
            lv_name_11_0=(Token)match(input,RULE_ID,FOLLOW_29); 

            			newLeafNode(lv_name_11_0, grammarAccess.getDiagramAccess().getNameIDTerminalRuleCall_10_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDiagramRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_11_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.ID");
            	    

            }


            }

            // InternalSiriusTextDsl.g:879:2: (otherlv_12= 'as' ( (lv_label_13_0= RULE_STRING ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==15) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalSiriusTextDsl.g:879:4: otherlv_12= 'as' ( (lv_label_13_0= RULE_STRING ) )
                    {
                    otherlv_12=(Token)match(input,15,FOLLOW_10); 

                        	newLeafNode(otherlv_12, grammarAccess.getDiagramAccess().getAsKeyword_11_0());
                        
                    // InternalSiriusTextDsl.g:883:1: ( (lv_label_13_0= RULE_STRING ) )
                    // InternalSiriusTextDsl.g:884:1: (lv_label_13_0= RULE_STRING )
                    {
                    // InternalSiriusTextDsl.g:884:1: (lv_label_13_0= RULE_STRING )
                    // InternalSiriusTextDsl.g:885:3: lv_label_13_0= RULE_STRING
                    {
                    lv_label_13_0=(Token)match(input,RULE_STRING,FOLLOW_30); 

                    			newLeafNode(lv_label_13_0, grammarAccess.getDiagramAccess().getLabelSTRINGTerminalRuleCall_11_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDiagramRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"label",
                            		lv_label_13_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_14=(Token)match(input,33,FOLLOW_10); 

                	newLeafNode(otherlv_14, grammarAccess.getDiagramAccess().getForKeyword_12());
                
            // InternalSiriusTextDsl.g:905:1: ( (lv_domainClass_15_0= RULE_STRING ) )
            // InternalSiriusTextDsl.g:906:1: (lv_domainClass_15_0= RULE_STRING )
            {
            // InternalSiriusTextDsl.g:906:1: (lv_domainClass_15_0= RULE_STRING )
            // InternalSiriusTextDsl.g:907:3: lv_domainClass_15_0= RULE_STRING
            {
            lv_domainClass_15_0=(Token)match(input,RULE_STRING,FOLLOW_31); 

            			newLeafNode(lv_domainClass_15_0, grammarAccess.getDiagramAccess().getDomainClassSTRINGTerminalRuleCall_13_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDiagramRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"domainClass",
                    		lv_domainClass_15_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
            	    

            }


            }

            // InternalSiriusTextDsl.g:923:2: (otherlv_16= '?' ( (lv_precondition_17_0= RULE_EXPRESSION ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==34) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalSiriusTextDsl.g:923:4: otherlv_16= '?' ( (lv_precondition_17_0= RULE_EXPRESSION ) )
                    {
                    otherlv_16=(Token)match(input,34,FOLLOW_32); 

                        	newLeafNode(otherlv_16, grammarAccess.getDiagramAccess().getQuestionMarkKeyword_14_0());
                        
                    // InternalSiriusTextDsl.g:927:1: ( (lv_precondition_17_0= RULE_EXPRESSION ) )
                    // InternalSiriusTextDsl.g:928:1: (lv_precondition_17_0= RULE_EXPRESSION )
                    {
                    // InternalSiriusTextDsl.g:928:1: (lv_precondition_17_0= RULE_EXPRESSION )
                    // InternalSiriusTextDsl.g:929:3: lv_precondition_17_0= RULE_EXPRESSION
                    {
                    lv_precondition_17_0=(Token)match(input,RULE_EXPRESSION,FOLLOW_11); 

                    			newLeafNode(lv_precondition_17_0, grammarAccess.getDiagramAccess().getPreconditionEXPRESSIONTerminalRuleCall_14_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDiagramRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"precondition",
                            		lv_precondition_17_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.EXPRESSION");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_18=(Token)match(input,16,FOLLOW_33); 

                	newLeafNode(otherlv_18, grammarAccess.getDiagramAccess().getLeftCurlyBracketKeyword_15());
                
            // InternalSiriusTextDsl.g:949:1: (otherlv_19= 'documentation' otherlv_20= '=' ( (lv_endUserDocumentation_21_0= RULE_STRING ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==35) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalSiriusTextDsl.g:949:3: otherlv_19= 'documentation' otherlv_20= '=' ( (lv_endUserDocumentation_21_0= RULE_STRING ) )
                    {
                    otherlv_19=(Token)match(input,35,FOLLOW_15); 

                        	newLeafNode(otherlv_19, grammarAccess.getDiagramAccess().getDocumentationKeyword_16_0());
                        
                    otherlv_20=(Token)match(input,20,FOLLOW_10); 

                        	newLeafNode(otherlv_20, grammarAccess.getDiagramAccess().getEqualsSignKeyword_16_1());
                        
                    // InternalSiriusTextDsl.g:957:1: ( (lv_endUserDocumentation_21_0= RULE_STRING ) )
                    // InternalSiriusTextDsl.g:958:1: (lv_endUserDocumentation_21_0= RULE_STRING )
                    {
                    // InternalSiriusTextDsl.g:958:1: (lv_endUserDocumentation_21_0= RULE_STRING )
                    // InternalSiriusTextDsl.g:959:3: lv_endUserDocumentation_21_0= RULE_STRING
                    {
                    lv_endUserDocumentation_21_0=(Token)match(input,RULE_STRING,FOLLOW_34); 

                    			newLeafNode(lv_endUserDocumentation_21_0, grammarAccess.getDiagramAccess().getEndUserDocumentationSTRINGTerminalRuleCall_16_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDiagramRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"endUserDocumentation",
                            		lv_endUserDocumentation_21_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:975:4: (otherlv_22= 'titleExpression' otherlv_23= '=' ( (lv_titleExpression_24_0= RULE_EXPRESSION ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==36) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalSiriusTextDsl.g:975:6: otherlv_22= 'titleExpression' otherlv_23= '=' ( (lv_titleExpression_24_0= RULE_EXPRESSION ) )
                    {
                    otherlv_22=(Token)match(input,36,FOLLOW_15); 

                        	newLeafNode(otherlv_22, grammarAccess.getDiagramAccess().getTitleExpressionKeyword_17_0());
                        
                    otherlv_23=(Token)match(input,20,FOLLOW_32); 

                        	newLeafNode(otherlv_23, grammarAccess.getDiagramAccess().getEqualsSignKeyword_17_1());
                        
                    // InternalSiriusTextDsl.g:983:1: ( (lv_titleExpression_24_0= RULE_EXPRESSION ) )
                    // InternalSiriusTextDsl.g:984:1: (lv_titleExpression_24_0= RULE_EXPRESSION )
                    {
                    // InternalSiriusTextDsl.g:984:1: (lv_titleExpression_24_0= RULE_EXPRESSION )
                    // InternalSiriusTextDsl.g:985:3: lv_titleExpression_24_0= RULE_EXPRESSION
                    {
                    lv_titleExpression_24_0=(Token)match(input,RULE_EXPRESSION,FOLLOW_35); 

                    			newLeafNode(lv_titleExpression_24_0, grammarAccess.getDiagramAccess().getTitleExpressionEXPRESSIONTerminalRuleCall_17_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDiagramRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"titleExpression",
                            		lv_titleExpression_24_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.EXPRESSION");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:1001:4: (otherlv_25= 'rootExpression' otherlv_26= '=' ( (lv_rootExpression_27_0= RULE_EXPRESSION ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==37) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalSiriusTextDsl.g:1001:6: otherlv_25= 'rootExpression' otherlv_26= '=' ( (lv_rootExpression_27_0= RULE_EXPRESSION ) )
                    {
                    otherlv_25=(Token)match(input,37,FOLLOW_15); 

                        	newLeafNode(otherlv_25, grammarAccess.getDiagramAccess().getRootExpressionKeyword_18_0());
                        
                    otherlv_26=(Token)match(input,20,FOLLOW_32); 

                        	newLeafNode(otherlv_26, grammarAccess.getDiagramAccess().getEqualsSignKeyword_18_1());
                        
                    // InternalSiriusTextDsl.g:1009:1: ( (lv_rootExpression_27_0= RULE_EXPRESSION ) )
                    // InternalSiriusTextDsl.g:1010:1: (lv_rootExpression_27_0= RULE_EXPRESSION )
                    {
                    // InternalSiriusTextDsl.g:1010:1: (lv_rootExpression_27_0= RULE_EXPRESSION )
                    // InternalSiriusTextDsl.g:1011:3: lv_rootExpression_27_0= RULE_EXPRESSION
                    {
                    lv_rootExpression_27_0=(Token)match(input,RULE_EXPRESSION,FOLLOW_36); 

                    			newLeafNode(lv_rootExpression_27_0, grammarAccess.getDiagramAccess().getRootExpressionEXPRESSIONTerminalRuleCall_18_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDiagramRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"rootExpression",
                            		lv_rootExpression_27_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.EXPRESSION");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:1027:4: (otherlv_28= 'defaultLayer' otherlv_29= '=' ( ( ruleQualifiedName ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==38) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalSiriusTextDsl.g:1027:6: otherlv_28= 'defaultLayer' otherlv_29= '=' ( ( ruleQualifiedName ) )
                    {
                    otherlv_28=(Token)match(input,38,FOLLOW_15); 

                        	newLeafNode(otherlv_28, grammarAccess.getDiagramAccess().getDefaultLayerKeyword_19_0());
                        
                    otherlv_29=(Token)match(input,20,FOLLOW_4); 

                        	newLeafNode(otherlv_29, grammarAccess.getDiagramAccess().getEqualsSignKeyword_19_1());
                        
                    // InternalSiriusTextDsl.g:1035:1: ( ( ruleQualifiedName ) )
                    // InternalSiriusTextDsl.g:1036:1: ( ruleQualifiedName )
                    {
                    // InternalSiriusTextDsl.g:1036:1: ( ruleQualifiedName )
                    // InternalSiriusTextDsl.g:1037:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDiagramRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getDiagramAccess().getDefaultLayerLayerCrossReference_19_2_0()); 
                    	    
                    pushFollow(FOLLOW_37);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:1050:4: (otherlv_31= 'additionalLayers' otherlv_32= '=' otherlv_33= '[' ( ( ( ruleQualifiedName ) ) (otherlv_35= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_37= ']' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==39) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalSiriusTextDsl.g:1050:6: otherlv_31= 'additionalLayers' otherlv_32= '=' otherlv_33= '[' ( ( ( ruleQualifiedName ) ) (otherlv_35= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_37= ']'
                    {
                    otherlv_31=(Token)match(input,39,FOLLOW_15); 

                        	newLeafNode(otherlv_31, grammarAccess.getDiagramAccess().getAdditionalLayersKeyword_20_0());
                        
                    otherlv_32=(Token)match(input,20,FOLLOW_16); 

                        	newLeafNode(otherlv_32, grammarAccess.getDiagramAccess().getEqualsSignKeyword_20_1());
                        
                    otherlv_33=(Token)match(input,21,FOLLOW_20); 

                        	newLeafNode(otherlv_33, grammarAccess.getDiagramAccess().getLeftSquareBracketKeyword_20_2());
                        
                    // InternalSiriusTextDsl.g:1062:1: ( ( ( ruleQualifiedName ) ) (otherlv_35= ',' ( ( ruleQualifiedName ) ) )* )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==RULE_ID) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // InternalSiriusTextDsl.g:1062:2: ( ( ruleQualifiedName ) ) (otherlv_35= ',' ( ( ruleQualifiedName ) ) )*
                            {
                            // InternalSiriusTextDsl.g:1062:2: ( ( ruleQualifiedName ) )
                            // InternalSiriusTextDsl.g:1063:1: ( ruleQualifiedName )
                            {
                            // InternalSiriusTextDsl.g:1063:1: ( ruleQualifiedName )
                            // InternalSiriusTextDsl.g:1064:3: ruleQualifiedName
                            {

                            			if (current==null) {
                            	            current = createModelElement(grammarAccess.getDiagramRule());
                            	        }
                                    
                             
                            	        newCompositeNode(grammarAccess.getDiagramAccess().getAdditionalLayersLayerCrossReference_20_3_0_0()); 
                            	    
                            pushFollow(FOLLOW_17);
                            ruleQualifiedName();

                            state._fsp--;

                             
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // InternalSiriusTextDsl.g:1077:2: (otherlv_35= ',' ( ( ruleQualifiedName ) ) )*
                            loop29:
                            do {
                                int alt29=2;
                                int LA29_0 = input.LA(1);

                                if ( (LA29_0==22) ) {
                                    alt29=1;
                                }


                                switch (alt29) {
                            	case 1 :
                            	    // InternalSiriusTextDsl.g:1077:4: otherlv_35= ',' ( ( ruleQualifiedName ) )
                            	    {
                            	    otherlv_35=(Token)match(input,22,FOLLOW_4); 

                            	        	newLeafNode(otherlv_35, grammarAccess.getDiagramAccess().getCommaKeyword_20_3_1_0());
                            	        
                            	    // InternalSiriusTextDsl.g:1081:1: ( ( ruleQualifiedName ) )
                            	    // InternalSiriusTextDsl.g:1082:1: ( ruleQualifiedName )
                            	    {
                            	    // InternalSiriusTextDsl.g:1082:1: ( ruleQualifiedName )
                            	    // InternalSiriusTextDsl.g:1083:3: ruleQualifiedName
                            	    {

                            	    			if (current==null) {
                            	    	            current = createModelElement(grammarAccess.getDiagramRule());
                            	    	        }
                            	            
                            	     
                            	    	        newCompositeNode(grammarAccess.getDiagramAccess().getAdditionalLayersLayerCrossReference_20_3_1_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_17);
                            	    ruleQualifiedName();

                            	    state._fsp--;

                            	     
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop29;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_37=(Token)match(input,23,FOLLOW_21); 

                        	newLeafNode(otherlv_37, grammarAccess.getDiagramAccess().getRightSquareBracketKeyword_20_4());
                        

                    }
                    break;

            }

            otherlv_38=(Token)match(input,17,FOLLOW_2); 

                	newLeafNode(otherlv_38, grammarAccess.getDiagramAccess().getRightCurlyBracketKeyword_21());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDiagram"


    // $ANTLR start "entryRuleLayer"
    // InternalSiriusTextDsl.g:1112:1: entryRuleLayer returns [EObject current=null] : iv_ruleLayer= ruleLayer EOF ;
    public final EObject entryRuleLayer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayer = null;


        try {
            // InternalSiriusTextDsl.g:1113:2: (iv_ruleLayer= ruleLayer EOF )
            // InternalSiriusTextDsl.g:1114:2: iv_ruleLayer= ruleLayer EOF
            {
             newCompositeNode(grammarAccess.getLayerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLayer=ruleLayer();

            state._fsp--;

             current =iv_ruleLayer; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLayer"


    // $ANTLR start "ruleLayer"
    // InternalSiriusTextDsl.g:1121:1: ruleLayer returns [EObject current=null] : ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'layer' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'icon' otherlv_5= '=' ( (lv_icon_6_0= RULE_STRING ) ) )? otherlv_7= 'mappings' otherlv_8= '=' otherlv_9= '[' ( ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_13= ']' otherlv_14= 'edges' otherlv_15= '=' otherlv_16= '[' otherlv_17= ']' otherlv_18= '}' ) ;
    public final EObject ruleLayer() throws RecognitionException {
        EObject current = null;

        Token lv_documentation_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_icon_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;

         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:1124:28: ( ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'layer' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'icon' otherlv_5= '=' ( (lv_icon_6_0= RULE_STRING ) ) )? otherlv_7= 'mappings' otherlv_8= '=' otherlv_9= '[' ( ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_13= ']' otherlv_14= 'edges' otherlv_15= '=' otherlv_16= '[' otherlv_17= ']' otherlv_18= '}' ) )
            // InternalSiriusTextDsl.g:1125:1: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'layer' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'icon' otherlv_5= '=' ( (lv_icon_6_0= RULE_STRING ) ) )? otherlv_7= 'mappings' otherlv_8= '=' otherlv_9= '[' ( ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_13= ']' otherlv_14= 'edges' otherlv_15= '=' otherlv_16= '[' otherlv_17= ']' otherlv_18= '}' )
            {
            // InternalSiriusTextDsl.g:1125:1: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'layer' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'icon' otherlv_5= '=' ( (lv_icon_6_0= RULE_STRING ) ) )? otherlv_7= 'mappings' otherlv_8= '=' otherlv_9= '[' ( ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_13= ']' otherlv_14= 'edges' otherlv_15= '=' otherlv_16= '[' otherlv_17= ']' otherlv_18= '}' )
            // InternalSiriusTextDsl.g:1125:2: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'layer' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'icon' otherlv_5= '=' ( (lv_icon_6_0= RULE_STRING ) ) )? otherlv_7= 'mappings' otherlv_8= '=' otherlv_9= '[' ( ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_13= ']' otherlv_14= 'edges' otherlv_15= '=' otherlv_16= '[' otherlv_17= ']' otherlv_18= '}'
            {
            // InternalSiriusTextDsl.g:1125:2: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_DOCUMENTATION) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalSiriusTextDsl.g:1126:1: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    {
                    // InternalSiriusTextDsl.g:1126:1: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    // InternalSiriusTextDsl.g:1127:3: lv_documentation_0_0= RULE_DOCUMENTATION
                    {
                    lv_documentation_0_0=(Token)match(input,RULE_DOCUMENTATION,FOLLOW_38); 

                    			newLeafNode(lv_documentation_0_0, grammarAccess.getLayerAccess().getDocumentationDOCUMENTATIONTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLayerRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"documentation",
                            		lv_documentation_0_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.DOCUMENTATION");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,40,FOLLOW_4); 

                	newLeafNode(otherlv_1, grammarAccess.getLayerAccess().getLayerKeyword_1());
                
            // InternalSiriusTextDsl.g:1147:1: ( (lv_name_2_0= RULE_ID ) )
            // InternalSiriusTextDsl.g:1148:1: (lv_name_2_0= RULE_ID )
            {
            // InternalSiriusTextDsl.g:1148:1: (lv_name_2_0= RULE_ID )
            // InternalSiriusTextDsl.g:1149:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            			newLeafNode(lv_name_2_0, grammarAccess.getLayerAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLayerRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_39); 

                	newLeafNode(otherlv_3, grammarAccess.getLayerAccess().getLeftCurlyBracketKeyword_3());
                
            // InternalSiriusTextDsl.g:1169:1: (otherlv_4= 'icon' otherlv_5= '=' ( (lv_icon_6_0= RULE_STRING ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==24) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalSiriusTextDsl.g:1169:3: otherlv_4= 'icon' otherlv_5= '=' ( (lv_icon_6_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,24,FOLLOW_15); 

                        	newLeafNode(otherlv_4, grammarAccess.getLayerAccess().getIconKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,20,FOLLOW_10); 

                        	newLeafNode(otherlv_5, grammarAccess.getLayerAccess().getEqualsSignKeyword_4_1());
                        
                    // InternalSiriusTextDsl.g:1177:1: ( (lv_icon_6_0= RULE_STRING ) )
                    // InternalSiriusTextDsl.g:1178:1: (lv_icon_6_0= RULE_STRING )
                    {
                    // InternalSiriusTextDsl.g:1178:1: (lv_icon_6_0= RULE_STRING )
                    // InternalSiriusTextDsl.g:1179:3: lv_icon_6_0= RULE_STRING
                    {
                    lv_icon_6_0=(Token)match(input,RULE_STRING,FOLLOW_40); 

                    			newLeafNode(lv_icon_6_0, grammarAccess.getLayerAccess().getIconSTRINGTerminalRuleCall_4_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLayerRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"icon",
                            		lv_icon_6_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,41,FOLLOW_15); 

                	newLeafNode(otherlv_7, grammarAccess.getLayerAccess().getMappingsKeyword_5());
                
            otherlv_8=(Token)match(input,20,FOLLOW_16); 

                	newLeafNode(otherlv_8, grammarAccess.getLayerAccess().getEqualsSignKeyword_6());
                
            otherlv_9=(Token)match(input,21,FOLLOW_20); 

                	newLeafNode(otherlv_9, grammarAccess.getLayerAccess().getLeftSquareBracketKeyword_7());
                
            // InternalSiriusTextDsl.g:1207:1: ( ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_ID) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalSiriusTextDsl.g:1207:2: ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    // InternalSiriusTextDsl.g:1207:2: ( ( ruleQualifiedName ) )
                    // InternalSiriusTextDsl.g:1208:1: ( ruleQualifiedName )
                    {
                    // InternalSiriusTextDsl.g:1208:1: ( ruleQualifiedName )
                    // InternalSiriusTextDsl.g:1209:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getLayerRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getLayerAccess().getMappingsMappingCrossReference_8_0_0()); 
                    	    
                    pushFollow(FOLLOW_17);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalSiriusTextDsl.g:1222:2: (otherlv_11= ',' ( ( ruleQualifiedName ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==22) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalSiriusTextDsl.g:1222:4: otherlv_11= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_11=(Token)match(input,22,FOLLOW_4); 

                    	        	newLeafNode(otherlv_11, grammarAccess.getLayerAccess().getCommaKeyword_8_1_0());
                    	        
                    	    // InternalSiriusTextDsl.g:1226:1: ( ( ruleQualifiedName ) )
                    	    // InternalSiriusTextDsl.g:1227:1: ( ruleQualifiedName )
                    	    {
                    	    // InternalSiriusTextDsl.g:1227:1: ( ruleQualifiedName )
                    	    // InternalSiriusTextDsl.g:1228:3: ruleQualifiedName
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getLayerRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getLayerAccess().getMappingsMappingCrossReference_8_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_17);
                    	    ruleQualifiedName();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_13=(Token)match(input,23,FOLLOW_41); 

                	newLeafNode(otherlv_13, grammarAccess.getLayerAccess().getRightSquareBracketKeyword_9());
                
            otherlv_14=(Token)match(input,42,FOLLOW_15); 

                	newLeafNode(otherlv_14, grammarAccess.getLayerAccess().getEdgesKeyword_10());
                
            otherlv_15=(Token)match(input,20,FOLLOW_16); 

                	newLeafNode(otherlv_15, grammarAccess.getLayerAccess().getEqualsSignKeyword_11());
                
            otherlv_16=(Token)match(input,21,FOLLOW_42); 

                	newLeafNode(otherlv_16, grammarAccess.getLayerAccess().getLeftSquareBracketKeyword_12());
                
            otherlv_17=(Token)match(input,23,FOLLOW_21); 

                	newLeafNode(otherlv_17, grammarAccess.getLayerAccess().getRightSquareBracketKeyword_13());
                
            otherlv_18=(Token)match(input,17,FOLLOW_2); 

                	newLeafNode(otherlv_18, grammarAccess.getLayerAccess().getRightCurlyBracketKeyword_14());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLayer"


    // $ANTLR start "entryRuleMapping"
    // InternalSiriusTextDsl.g:1273:1: entryRuleMapping returns [EObject current=null] : iv_ruleMapping= ruleMapping EOF ;
    public final EObject entryRuleMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapping = null;


        try {
            // InternalSiriusTextDsl.g:1274:2: (iv_ruleMapping= ruleMapping EOF )
            // InternalSiriusTextDsl.g:1275:2: iv_ruleMapping= ruleMapping EOF
            {
             newCompositeNode(grammarAccess.getMappingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMapping=ruleMapping();

            state._fsp--;

             current =iv_ruleMapping; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMapping"


    // $ANTLR start "ruleMapping"
    // InternalSiriusTextDsl.g:1282:1: ruleMapping returns [EObject current=null] : this_Container_0= ruleContainer ;
    public final EObject ruleMapping() throws RecognitionException {
        EObject current = null;

        EObject this_Container_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:1285:28: (this_Container_0= ruleContainer )
            // InternalSiriusTextDsl.g:1287:5: this_Container_0= ruleContainer
            {
             
                    newCompositeNode(grammarAccess.getMappingAccess().getContainerParserRuleCall()); 
                
            pushFollow(FOLLOW_2);
            this_Container_0=ruleContainer();

            state._fsp--;

             
                    current = this_Container_0; 
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMapping"


    // $ANTLR start "entryRuleContainer"
    // InternalSiriusTextDsl.g:1303:1: entryRuleContainer returns [EObject current=null] : iv_ruleContainer= ruleContainer EOF ;
    public final EObject entryRuleContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainer = null;


        try {
            // InternalSiriusTextDsl.g:1304:2: (iv_ruleContainer= ruleContainer EOF )
            // InternalSiriusTextDsl.g:1305:2: iv_ruleContainer= ruleContainer EOF
            {
             newCompositeNode(grammarAccess.getContainerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContainer=ruleContainer();

            state._fsp--;

             current =iv_ruleContainer; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContainer"


    // $ANTLR start "ruleContainer"
    // InternalSiriusTextDsl.g:1312:1: ruleContainer returns [EObject current=null] : ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? ( (lv_list_1_0= 'list' ) )? otherlv_2= 'container' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'as' ( (lv_label_5_0= RULE_STRING ) ) )? otherlv_6= 'for' ( (lv_domainClass_7_0= RULE_STRING ) ) otherlv_8= 'style' ( ( ruleQualifiedName ) ) (otherlv_10= '?' ( (lv_precondition_11_0= RULE_EXPRESSION ) ) )? otherlv_12= '{' (otherlv_13= 'semanticCandidatesExpression' otherlv_14= '=' ( (lv_semanticCanditatesExpression_15_0= RULE_EXPRESSION ) ) )? ( (lv_conditionalStyles_16_0= ruleConditionalContainerStyleDeclaration ) )* otherlv_17= '}' ) ;
    public final EObject ruleContainer() throws RecognitionException {
        EObject current = null;

        Token lv_documentation_0_0=null;
        Token lv_list_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token lv_label_5_0=null;
        Token otherlv_6=null;
        Token lv_domainClass_7_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token lv_precondition_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token lv_semanticCanditatesExpression_15_0=null;
        Token otherlv_17=null;
        EObject lv_conditionalStyles_16_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:1315:28: ( ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? ( (lv_list_1_0= 'list' ) )? otherlv_2= 'container' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'as' ( (lv_label_5_0= RULE_STRING ) ) )? otherlv_6= 'for' ( (lv_domainClass_7_0= RULE_STRING ) ) otherlv_8= 'style' ( ( ruleQualifiedName ) ) (otherlv_10= '?' ( (lv_precondition_11_0= RULE_EXPRESSION ) ) )? otherlv_12= '{' (otherlv_13= 'semanticCandidatesExpression' otherlv_14= '=' ( (lv_semanticCanditatesExpression_15_0= RULE_EXPRESSION ) ) )? ( (lv_conditionalStyles_16_0= ruleConditionalContainerStyleDeclaration ) )* otherlv_17= '}' ) )
            // InternalSiriusTextDsl.g:1316:1: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? ( (lv_list_1_0= 'list' ) )? otherlv_2= 'container' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'as' ( (lv_label_5_0= RULE_STRING ) ) )? otherlv_6= 'for' ( (lv_domainClass_7_0= RULE_STRING ) ) otherlv_8= 'style' ( ( ruleQualifiedName ) ) (otherlv_10= '?' ( (lv_precondition_11_0= RULE_EXPRESSION ) ) )? otherlv_12= '{' (otherlv_13= 'semanticCandidatesExpression' otherlv_14= '=' ( (lv_semanticCanditatesExpression_15_0= RULE_EXPRESSION ) ) )? ( (lv_conditionalStyles_16_0= ruleConditionalContainerStyleDeclaration ) )* otherlv_17= '}' )
            {
            // InternalSiriusTextDsl.g:1316:1: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? ( (lv_list_1_0= 'list' ) )? otherlv_2= 'container' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'as' ( (lv_label_5_0= RULE_STRING ) ) )? otherlv_6= 'for' ( (lv_domainClass_7_0= RULE_STRING ) ) otherlv_8= 'style' ( ( ruleQualifiedName ) ) (otherlv_10= '?' ( (lv_precondition_11_0= RULE_EXPRESSION ) ) )? otherlv_12= '{' (otherlv_13= 'semanticCandidatesExpression' otherlv_14= '=' ( (lv_semanticCanditatesExpression_15_0= RULE_EXPRESSION ) ) )? ( (lv_conditionalStyles_16_0= ruleConditionalContainerStyleDeclaration ) )* otherlv_17= '}' )
            // InternalSiriusTextDsl.g:1316:2: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? ( (lv_list_1_0= 'list' ) )? otherlv_2= 'container' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'as' ( (lv_label_5_0= RULE_STRING ) ) )? otherlv_6= 'for' ( (lv_domainClass_7_0= RULE_STRING ) ) otherlv_8= 'style' ( ( ruleQualifiedName ) ) (otherlv_10= '?' ( (lv_precondition_11_0= RULE_EXPRESSION ) ) )? otherlv_12= '{' (otherlv_13= 'semanticCandidatesExpression' otherlv_14= '=' ( (lv_semanticCanditatesExpression_15_0= RULE_EXPRESSION ) ) )? ( (lv_conditionalStyles_16_0= ruleConditionalContainerStyleDeclaration ) )* otherlv_17= '}'
            {
            // InternalSiriusTextDsl.g:1316:2: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_DOCUMENTATION) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalSiriusTextDsl.g:1317:1: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    {
                    // InternalSiriusTextDsl.g:1317:1: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    // InternalSiriusTextDsl.g:1318:3: lv_documentation_0_0= RULE_DOCUMENTATION
                    {
                    lv_documentation_0_0=(Token)match(input,RULE_DOCUMENTATION,FOLLOW_43); 

                    			newLeafNode(lv_documentation_0_0, grammarAccess.getContainerAccess().getDocumentationDOCUMENTATIONTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getContainerRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"documentation",
                            		lv_documentation_0_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.DOCUMENTATION");
                    	    

                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:1334:3: ( (lv_list_1_0= 'list' ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==43) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalSiriusTextDsl.g:1335:1: (lv_list_1_0= 'list' )
                    {
                    // InternalSiriusTextDsl.g:1335:1: (lv_list_1_0= 'list' )
                    // InternalSiriusTextDsl.g:1336:3: lv_list_1_0= 'list'
                    {
                    lv_list_1_0=(Token)match(input,43,FOLLOW_44); 

                            newLeafNode(lv_list_1_0, grammarAccess.getContainerAccess().getListListKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getContainerRule());
                    	        }
                           		setWithLastConsumed(current, "list", true, "list");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,44,FOLLOW_4); 

                	newLeafNode(otherlv_2, grammarAccess.getContainerAccess().getContainerKeyword_2());
                
            // InternalSiriusTextDsl.g:1353:1: ( (lv_name_3_0= RULE_ID ) )
            // InternalSiriusTextDsl.g:1354:1: (lv_name_3_0= RULE_ID )
            {
            // InternalSiriusTextDsl.g:1354:1: (lv_name_3_0= RULE_ID )
            // InternalSiriusTextDsl.g:1355:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_29); 

            			newLeafNode(lv_name_3_0, grammarAccess.getContainerAccess().getNameIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getContainerRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.ID");
            	    

            }


            }

            // InternalSiriusTextDsl.g:1371:2: (otherlv_4= 'as' ( (lv_label_5_0= RULE_STRING ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==15) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalSiriusTextDsl.g:1371:4: otherlv_4= 'as' ( (lv_label_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,15,FOLLOW_10); 

                        	newLeafNode(otherlv_4, grammarAccess.getContainerAccess().getAsKeyword_4_0());
                        
                    // InternalSiriusTextDsl.g:1375:1: ( (lv_label_5_0= RULE_STRING ) )
                    // InternalSiriusTextDsl.g:1376:1: (lv_label_5_0= RULE_STRING )
                    {
                    // InternalSiriusTextDsl.g:1376:1: (lv_label_5_0= RULE_STRING )
                    // InternalSiriusTextDsl.g:1377:3: lv_label_5_0= RULE_STRING
                    {
                    lv_label_5_0=(Token)match(input,RULE_STRING,FOLLOW_30); 

                    			newLeafNode(lv_label_5_0, grammarAccess.getContainerAccess().getLabelSTRINGTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getContainerRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"label",
                            		lv_label_5_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,33,FOLLOW_10); 

                	newLeafNode(otherlv_6, grammarAccess.getContainerAccess().getForKeyword_5());
                
            // InternalSiriusTextDsl.g:1397:1: ( (lv_domainClass_7_0= RULE_STRING ) )
            // InternalSiriusTextDsl.g:1398:1: (lv_domainClass_7_0= RULE_STRING )
            {
            // InternalSiriusTextDsl.g:1398:1: (lv_domainClass_7_0= RULE_STRING )
            // InternalSiriusTextDsl.g:1399:3: lv_domainClass_7_0= RULE_STRING
            {
            lv_domainClass_7_0=(Token)match(input,RULE_STRING,FOLLOW_45); 

            			newLeafNode(lv_domainClass_7_0, grammarAccess.getContainerAccess().getDomainClassSTRINGTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getContainerRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"domainClass",
                    		lv_domainClass_7_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
            	    

            }


            }

            otherlv_8=(Token)match(input,45,FOLLOW_4); 

                	newLeafNode(otherlv_8, grammarAccess.getContainerAccess().getStyleKeyword_7());
                
            // InternalSiriusTextDsl.g:1419:1: ( ( ruleQualifiedName ) )
            // InternalSiriusTextDsl.g:1420:1: ( ruleQualifiedName )
            {
            // InternalSiriusTextDsl.g:1420:1: ( ruleQualifiedName )
            // InternalSiriusTextDsl.g:1421:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getContainerRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getContainerAccess().getStyleContainerStyleCrossReference_8_0()); 
            	    
            pushFollow(FOLLOW_31);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalSiriusTextDsl.g:1434:2: (otherlv_10= '?' ( (lv_precondition_11_0= RULE_EXPRESSION ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==34) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalSiriusTextDsl.g:1434:4: otherlv_10= '?' ( (lv_precondition_11_0= RULE_EXPRESSION ) )
                    {
                    otherlv_10=(Token)match(input,34,FOLLOW_32); 

                        	newLeafNode(otherlv_10, grammarAccess.getContainerAccess().getQuestionMarkKeyword_9_0());
                        
                    // InternalSiriusTextDsl.g:1438:1: ( (lv_precondition_11_0= RULE_EXPRESSION ) )
                    // InternalSiriusTextDsl.g:1439:1: (lv_precondition_11_0= RULE_EXPRESSION )
                    {
                    // InternalSiriusTextDsl.g:1439:1: (lv_precondition_11_0= RULE_EXPRESSION )
                    // InternalSiriusTextDsl.g:1440:3: lv_precondition_11_0= RULE_EXPRESSION
                    {
                    lv_precondition_11_0=(Token)match(input,RULE_EXPRESSION,FOLLOW_11); 

                    			newLeafNode(lv_precondition_11_0, grammarAccess.getContainerAccess().getPreconditionEXPRESSIONTerminalRuleCall_9_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getContainerRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"precondition",
                            		lv_precondition_11_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.EXPRESSION");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,16,FOLLOW_46); 

                	newLeafNode(otherlv_12, grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_10());
                
            // InternalSiriusTextDsl.g:1460:1: (otherlv_13= 'semanticCandidatesExpression' otherlv_14= '=' ( (lv_semanticCanditatesExpression_15_0= RULE_EXPRESSION ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==46) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalSiriusTextDsl.g:1460:3: otherlv_13= 'semanticCandidatesExpression' otherlv_14= '=' ( (lv_semanticCanditatesExpression_15_0= RULE_EXPRESSION ) )
                    {
                    otherlv_13=(Token)match(input,46,FOLLOW_15); 

                        	newLeafNode(otherlv_13, grammarAccess.getContainerAccess().getSemanticCandidatesExpressionKeyword_11_0());
                        
                    otherlv_14=(Token)match(input,20,FOLLOW_32); 

                        	newLeafNode(otherlv_14, grammarAccess.getContainerAccess().getEqualsSignKeyword_11_1());
                        
                    // InternalSiriusTextDsl.g:1468:1: ( (lv_semanticCanditatesExpression_15_0= RULE_EXPRESSION ) )
                    // InternalSiriusTextDsl.g:1469:1: (lv_semanticCanditatesExpression_15_0= RULE_EXPRESSION )
                    {
                    // InternalSiriusTextDsl.g:1469:1: (lv_semanticCanditatesExpression_15_0= RULE_EXPRESSION )
                    // InternalSiriusTextDsl.g:1470:3: lv_semanticCanditatesExpression_15_0= RULE_EXPRESSION
                    {
                    lv_semanticCanditatesExpression_15_0=(Token)match(input,RULE_EXPRESSION,FOLLOW_47); 

                    			newLeafNode(lv_semanticCanditatesExpression_15_0, grammarAccess.getContainerAccess().getSemanticCanditatesExpressionEXPRESSIONTerminalRuleCall_11_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getContainerRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"semanticCanditatesExpression",
                            		lv_semanticCanditatesExpression_15_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.EXPRESSION");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:1486:4: ( (lv_conditionalStyles_16_0= ruleConditionalContainerStyleDeclaration ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==45) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalSiriusTextDsl.g:1487:1: (lv_conditionalStyles_16_0= ruleConditionalContainerStyleDeclaration )
            	    {
            	    // InternalSiriusTextDsl.g:1487:1: (lv_conditionalStyles_16_0= ruleConditionalContainerStyleDeclaration )
            	    // InternalSiriusTextDsl.g:1488:3: lv_conditionalStyles_16_0= ruleConditionalContainerStyleDeclaration
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getContainerAccess().getConditionalStylesConditionalContainerStyleDeclarationParserRuleCall_12_0()); 
            	    	    
            	    pushFollow(FOLLOW_47);
            	    lv_conditionalStyles_16_0=ruleConditionalContainerStyleDeclaration();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getContainerRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"conditionalStyles",
            	            		lv_conditionalStyles_16_0, 
            	            		"org.obeonetwork.sirius.text.SiriusTextDsl.ConditionalContainerStyleDeclaration");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            otherlv_17=(Token)match(input,17,FOLLOW_2); 

                	newLeafNode(otherlv_17, grammarAccess.getContainerAccess().getRightCurlyBracketKeyword_13());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContainer"


    // $ANTLR start "entryRuleConditionalContainerStyleDeclaration"
    // InternalSiriusTextDsl.g:1516:1: entryRuleConditionalContainerStyleDeclaration returns [EObject current=null] : iv_ruleConditionalContainerStyleDeclaration= ruleConditionalContainerStyleDeclaration EOF ;
    public final EObject entryRuleConditionalContainerStyleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalContainerStyleDeclaration = null;


        try {
            // InternalSiriusTextDsl.g:1517:2: (iv_ruleConditionalContainerStyleDeclaration= ruleConditionalContainerStyleDeclaration EOF )
            // InternalSiriusTextDsl.g:1518:2: iv_ruleConditionalContainerStyleDeclaration= ruleConditionalContainerStyleDeclaration EOF
            {
             newCompositeNode(grammarAccess.getConditionalContainerStyleDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditionalContainerStyleDeclaration=ruleConditionalContainerStyleDeclaration();

            state._fsp--;

             current =iv_ruleConditionalContainerStyleDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConditionalContainerStyleDeclaration"


    // $ANTLR start "ruleConditionalContainerStyleDeclaration"
    // InternalSiriusTextDsl.g:1525:1: ruleConditionalContainerStyleDeclaration returns [EObject current=null] : (otherlv_0= 'style' ( ( ruleQualifiedName ) ) otherlv_2= 'if' ( (lv_conditionalStyleExpression_3_0= RULE_EXPRESSION ) ) ) ;
    public final EObject ruleConditionalContainerStyleDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_conditionalStyleExpression_3_0=null;

         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:1528:28: ( (otherlv_0= 'style' ( ( ruleQualifiedName ) ) otherlv_2= 'if' ( (lv_conditionalStyleExpression_3_0= RULE_EXPRESSION ) ) ) )
            // InternalSiriusTextDsl.g:1529:1: (otherlv_0= 'style' ( ( ruleQualifiedName ) ) otherlv_2= 'if' ( (lv_conditionalStyleExpression_3_0= RULE_EXPRESSION ) ) )
            {
            // InternalSiriusTextDsl.g:1529:1: (otherlv_0= 'style' ( ( ruleQualifiedName ) ) otherlv_2= 'if' ( (lv_conditionalStyleExpression_3_0= RULE_EXPRESSION ) ) )
            // InternalSiriusTextDsl.g:1529:3: otherlv_0= 'style' ( ( ruleQualifiedName ) ) otherlv_2= 'if' ( (lv_conditionalStyleExpression_3_0= RULE_EXPRESSION ) )
            {
            otherlv_0=(Token)match(input,45,FOLLOW_4); 

                	newLeafNode(otherlv_0, grammarAccess.getConditionalContainerStyleDeclarationAccess().getStyleKeyword_0());
                
            // InternalSiriusTextDsl.g:1533:1: ( ( ruleQualifiedName ) )
            // InternalSiriusTextDsl.g:1534:1: ( ruleQualifiedName )
            {
            // InternalSiriusTextDsl.g:1534:1: ( ruleQualifiedName )
            // InternalSiriusTextDsl.g:1535:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getConditionalContainerStyleDeclarationRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getConditionalContainerStyleDeclarationAccess().getStyleContainerStyleCrossReference_1_0()); 
            	    
            pushFollow(FOLLOW_48);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,47,FOLLOW_32); 

                	newLeafNode(otherlv_2, grammarAccess.getConditionalContainerStyleDeclarationAccess().getIfKeyword_2());
                
            // InternalSiriusTextDsl.g:1552:1: ( (lv_conditionalStyleExpression_3_0= RULE_EXPRESSION ) )
            // InternalSiriusTextDsl.g:1553:1: (lv_conditionalStyleExpression_3_0= RULE_EXPRESSION )
            {
            // InternalSiriusTextDsl.g:1553:1: (lv_conditionalStyleExpression_3_0= RULE_EXPRESSION )
            // InternalSiriusTextDsl.g:1554:3: lv_conditionalStyleExpression_3_0= RULE_EXPRESSION
            {
            lv_conditionalStyleExpression_3_0=(Token)match(input,RULE_EXPRESSION,FOLLOW_2); 

            			newLeafNode(lv_conditionalStyleExpression_3_0, grammarAccess.getConditionalContainerStyleDeclarationAccess().getConditionalStyleExpressionEXPRESSIONTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getConditionalContainerStyleDeclarationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"conditionalStyleExpression",
                    		lv_conditionalStyleExpression_3_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.EXPRESSION");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConditionalContainerStyleDeclaration"


    // $ANTLR start "entryRuleStyle"
    // InternalSiriusTextDsl.g:1578:1: entryRuleStyle returns [EObject current=null] : iv_ruleStyle= ruleStyle EOF ;
    public final EObject entryRuleStyle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStyle = null;


        try {
            // InternalSiriusTextDsl.g:1579:2: (iv_ruleStyle= ruleStyle EOF )
            // InternalSiriusTextDsl.g:1580:2: iv_ruleStyle= ruleStyle EOF
            {
             newCompositeNode(grammarAccess.getStyleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStyle=ruleStyle();

            state._fsp--;

             current =iv_ruleStyle; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStyle"


    // $ANTLR start "ruleStyle"
    // InternalSiriusTextDsl.g:1587:1: ruleStyle returns [EObject current=null] : this_ContainerStyle_0= ruleContainerStyle ;
    public final EObject ruleStyle() throws RecognitionException {
        EObject current = null;

        EObject this_ContainerStyle_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:1590:28: (this_ContainerStyle_0= ruleContainerStyle )
            // InternalSiriusTextDsl.g:1592:5: this_ContainerStyle_0= ruleContainerStyle
            {
             
                    newCompositeNode(grammarAccess.getStyleAccess().getContainerStyleParserRuleCall()); 
                
            pushFollow(FOLLOW_2);
            this_ContainerStyle_0=ruleContainerStyle();

            state._fsp--;

             
                    current = this_ContainerStyle_0; 
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStyle"


    // $ANTLR start "entryRuleContainerStyle"
    // InternalSiriusTextDsl.g:1608:1: entryRuleContainerStyle returns [EObject current=null] : iv_ruleContainerStyle= ruleContainerStyle EOF ;
    public final EObject entryRuleContainerStyle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainerStyle = null;


        try {
            // InternalSiriusTextDsl.g:1609:2: (iv_ruleContainerStyle= ruleContainerStyle EOF )
            // InternalSiriusTextDsl.g:1610:2: iv_ruleContainerStyle= ruleContainerStyle EOF
            {
             newCompositeNode(grammarAccess.getContainerStyleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContainerStyle=ruleContainerStyle();

            state._fsp--;

             current =iv_ruleContainerStyle; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContainerStyle"


    // $ANTLR start "ruleContainerStyle"
    // InternalSiriusTextDsl.g:1617:1: ruleContainerStyle returns [EObject current=null] : this_Gradient_0= ruleGradient ;
    public final EObject ruleContainerStyle() throws RecognitionException {
        EObject current = null;

        EObject this_Gradient_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:1620:28: (this_Gradient_0= ruleGradient )
            // InternalSiriusTextDsl.g:1622:5: this_Gradient_0= ruleGradient
            {
             
                    newCompositeNode(grammarAccess.getContainerStyleAccess().getGradientParserRuleCall()); 
                
            pushFollow(FOLLOW_2);
            this_Gradient_0=ruleGradient();

            state._fsp--;

             
                    current = this_Gradient_0; 
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContainerStyle"


    // $ANTLR start "entryRuleGradient"
    // InternalSiriusTextDsl.g:1638:1: entryRuleGradient returns [EObject current=null] : iv_ruleGradient= ruleGradient EOF ;
    public final EObject entryRuleGradient() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGradient = null;


        try {
            // InternalSiriusTextDsl.g:1639:2: (iv_ruleGradient= ruleGradient EOF )
            // InternalSiriusTextDsl.g:1640:2: iv_ruleGradient= ruleGradient EOF
            {
             newCompositeNode(grammarAccess.getGradientRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGradient=ruleGradient();

            state._fsp--;

             current =iv_ruleGradient; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGradient"


    // $ANTLR start "ruleGradient"
    // InternalSiriusTextDsl.g:1647:1: ruleGradient returns [EObject current=null] : ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'gradient' ( (lv_direction_2_0= ruleGradientDirection ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'from' ( ( ruleQualifiedName ) ) otherlv_6= 'to' ( ( ruleQualifiedName ) ) otherlv_8= '{' (otherlv_9= 'label' ( (lv_labelAlignment_10_0= ruleLabelAlignment ) ) ( (lv_labelExpression_11_0= RULE_EXPRESSION ) ) otherlv_12= 'in' ( ( ruleQualifiedName ) ) )? (otherlv_14= 'border' otherlv_15= 'size' otherlv_16= '=' ( (lv_borderSize_17_0= RULE_INT ) ) otherlv_18= 'in' ( ( ruleQualifiedName ) ) )? (otherlv_20= 'icon' otherlv_21= '=' ( (lv_icon_22_0= RULE_STRING ) ) )? (otherlv_23= 'height' otherlv_24= '=' ( (lv_height_25_0= RULE_INT ) ) )? (otherlv_26= 'width' otherlv_27= '=' ( (lv_width_28_0= RULE_INT ) ) )? otherlv_29= '}' ) ;
    public final EObject ruleGradient() throws RecognitionException {
        EObject current = null;

        Token lv_documentation_0_0=null;
        Token otherlv_1=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_labelExpression_11_0=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token lv_borderSize_17_0=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token lv_icon_22_0=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token lv_height_25_0=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token lv_width_28_0=null;
        Token otherlv_29=null;
        Enumerator lv_direction_2_0 = null;

        Enumerator lv_labelAlignment_10_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:1650:28: ( ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'gradient' ( (lv_direction_2_0= ruleGradientDirection ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'from' ( ( ruleQualifiedName ) ) otherlv_6= 'to' ( ( ruleQualifiedName ) ) otherlv_8= '{' (otherlv_9= 'label' ( (lv_labelAlignment_10_0= ruleLabelAlignment ) ) ( (lv_labelExpression_11_0= RULE_EXPRESSION ) ) otherlv_12= 'in' ( ( ruleQualifiedName ) ) )? (otherlv_14= 'border' otherlv_15= 'size' otherlv_16= '=' ( (lv_borderSize_17_0= RULE_INT ) ) otherlv_18= 'in' ( ( ruleQualifiedName ) ) )? (otherlv_20= 'icon' otherlv_21= '=' ( (lv_icon_22_0= RULE_STRING ) ) )? (otherlv_23= 'height' otherlv_24= '=' ( (lv_height_25_0= RULE_INT ) ) )? (otherlv_26= 'width' otherlv_27= '=' ( (lv_width_28_0= RULE_INT ) ) )? otherlv_29= '}' ) )
            // InternalSiriusTextDsl.g:1651:1: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'gradient' ( (lv_direction_2_0= ruleGradientDirection ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'from' ( ( ruleQualifiedName ) ) otherlv_6= 'to' ( ( ruleQualifiedName ) ) otherlv_8= '{' (otherlv_9= 'label' ( (lv_labelAlignment_10_0= ruleLabelAlignment ) ) ( (lv_labelExpression_11_0= RULE_EXPRESSION ) ) otherlv_12= 'in' ( ( ruleQualifiedName ) ) )? (otherlv_14= 'border' otherlv_15= 'size' otherlv_16= '=' ( (lv_borderSize_17_0= RULE_INT ) ) otherlv_18= 'in' ( ( ruleQualifiedName ) ) )? (otherlv_20= 'icon' otherlv_21= '=' ( (lv_icon_22_0= RULE_STRING ) ) )? (otherlv_23= 'height' otherlv_24= '=' ( (lv_height_25_0= RULE_INT ) ) )? (otherlv_26= 'width' otherlv_27= '=' ( (lv_width_28_0= RULE_INT ) ) )? otherlv_29= '}' )
            {
            // InternalSiriusTextDsl.g:1651:1: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'gradient' ( (lv_direction_2_0= ruleGradientDirection ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'from' ( ( ruleQualifiedName ) ) otherlv_6= 'to' ( ( ruleQualifiedName ) ) otherlv_8= '{' (otherlv_9= 'label' ( (lv_labelAlignment_10_0= ruleLabelAlignment ) ) ( (lv_labelExpression_11_0= RULE_EXPRESSION ) ) otherlv_12= 'in' ( ( ruleQualifiedName ) ) )? (otherlv_14= 'border' otherlv_15= 'size' otherlv_16= '=' ( (lv_borderSize_17_0= RULE_INT ) ) otherlv_18= 'in' ( ( ruleQualifiedName ) ) )? (otherlv_20= 'icon' otherlv_21= '=' ( (lv_icon_22_0= RULE_STRING ) ) )? (otherlv_23= 'height' otherlv_24= '=' ( (lv_height_25_0= RULE_INT ) ) )? (otherlv_26= 'width' otherlv_27= '=' ( (lv_width_28_0= RULE_INT ) ) )? otherlv_29= '}' )
            // InternalSiriusTextDsl.g:1651:2: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'gradient' ( (lv_direction_2_0= ruleGradientDirection ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'from' ( ( ruleQualifiedName ) ) otherlv_6= 'to' ( ( ruleQualifiedName ) ) otherlv_8= '{' (otherlv_9= 'label' ( (lv_labelAlignment_10_0= ruleLabelAlignment ) ) ( (lv_labelExpression_11_0= RULE_EXPRESSION ) ) otherlv_12= 'in' ( ( ruleQualifiedName ) ) )? (otherlv_14= 'border' otherlv_15= 'size' otherlv_16= '=' ( (lv_borderSize_17_0= RULE_INT ) ) otherlv_18= 'in' ( ( ruleQualifiedName ) ) )? (otherlv_20= 'icon' otherlv_21= '=' ( (lv_icon_22_0= RULE_STRING ) ) )? (otherlv_23= 'height' otherlv_24= '=' ( (lv_height_25_0= RULE_INT ) ) )? (otherlv_26= 'width' otherlv_27= '=' ( (lv_width_28_0= RULE_INT ) ) )? otherlv_29= '}'
            {
            // InternalSiriusTextDsl.g:1651:2: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_DOCUMENTATION) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalSiriusTextDsl.g:1652:1: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    {
                    // InternalSiriusTextDsl.g:1652:1: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    // InternalSiriusTextDsl.g:1653:3: lv_documentation_0_0= RULE_DOCUMENTATION
                    {
                    lv_documentation_0_0=(Token)match(input,RULE_DOCUMENTATION,FOLLOW_49); 

                    			newLeafNode(lv_documentation_0_0, grammarAccess.getGradientAccess().getDocumentationDOCUMENTATIONTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGradientRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"documentation",
                            		lv_documentation_0_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.DOCUMENTATION");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,48,FOLLOW_50); 

                	newLeafNode(otherlv_1, grammarAccess.getGradientAccess().getGradientKeyword_1());
                
            // InternalSiriusTextDsl.g:1673:1: ( (lv_direction_2_0= ruleGradientDirection ) )
            // InternalSiriusTextDsl.g:1674:1: (lv_direction_2_0= ruleGradientDirection )
            {
            // InternalSiriusTextDsl.g:1674:1: (lv_direction_2_0= ruleGradientDirection )
            // InternalSiriusTextDsl.g:1675:3: lv_direction_2_0= ruleGradientDirection
            {
             
            	        newCompositeNode(grammarAccess.getGradientAccess().getDirectionGradientDirectionEnumRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_4);
            lv_direction_2_0=ruleGradientDirection();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGradientRule());
            	        }
                   		set(
                   			current, 
                   			"direction",
                    		lv_direction_2_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.GradientDirection");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalSiriusTextDsl.g:1691:2: ( (lv_name_3_0= RULE_ID ) )
            // InternalSiriusTextDsl.g:1692:1: (lv_name_3_0= RULE_ID )
            {
            // InternalSiriusTextDsl.g:1692:1: (lv_name_3_0= RULE_ID )
            // InternalSiriusTextDsl.g:1693:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_51); 

            			newLeafNode(lv_name_3_0, grammarAccess.getGradientAccess().getNameIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGradientRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.ID");
            	    

            }


            }

            otherlv_4=(Token)match(input,49,FOLLOW_4); 

                	newLeafNode(otherlv_4, grammarAccess.getGradientAccess().getFromKeyword_4());
                
            // InternalSiriusTextDsl.g:1713:1: ( ( ruleQualifiedName ) )
            // InternalSiriusTextDsl.g:1714:1: ( ruleQualifiedName )
            {
            // InternalSiriusTextDsl.g:1714:1: ( ruleQualifiedName )
            // InternalSiriusTextDsl.g:1715:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getGradientRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getGradientAccess().getBackgroundColorColorCrossReference_5_0()); 
            	    
            pushFollow(FOLLOW_52);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,50,FOLLOW_4); 

                	newLeafNode(otherlv_6, grammarAccess.getGradientAccess().getToKeyword_6());
                
            // InternalSiriusTextDsl.g:1732:1: ( ( ruleQualifiedName ) )
            // InternalSiriusTextDsl.g:1733:1: ( ruleQualifiedName )
            {
            // InternalSiriusTextDsl.g:1733:1: ( ruleQualifiedName )
            // InternalSiriusTextDsl.g:1734:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getGradientRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getGradientAccess().getForegroundColorColorCrossReference_7_0()); 
            	    
            pushFollow(FOLLOW_11);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_8=(Token)match(input,16,FOLLOW_53); 

                	newLeafNode(otherlv_8, grammarAccess.getGradientAccess().getLeftCurlyBracketKeyword_8());
                
            // InternalSiriusTextDsl.g:1751:1: (otherlv_9= 'label' ( (lv_labelAlignment_10_0= ruleLabelAlignment ) ) ( (lv_labelExpression_11_0= RULE_EXPRESSION ) ) otherlv_12= 'in' ( ( ruleQualifiedName ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==51) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalSiriusTextDsl.g:1751:3: otherlv_9= 'label' ( (lv_labelAlignment_10_0= ruleLabelAlignment ) ) ( (lv_labelExpression_11_0= RULE_EXPRESSION ) ) otherlv_12= 'in' ( ( ruleQualifiedName ) )
                    {
                    otherlv_9=(Token)match(input,51,FOLLOW_54); 

                        	newLeafNode(otherlv_9, grammarAccess.getGradientAccess().getLabelKeyword_9_0());
                        
                    // InternalSiriusTextDsl.g:1755:1: ( (lv_labelAlignment_10_0= ruleLabelAlignment ) )
                    // InternalSiriusTextDsl.g:1756:1: (lv_labelAlignment_10_0= ruleLabelAlignment )
                    {
                    // InternalSiriusTextDsl.g:1756:1: (lv_labelAlignment_10_0= ruleLabelAlignment )
                    // InternalSiriusTextDsl.g:1757:3: lv_labelAlignment_10_0= ruleLabelAlignment
                    {
                     
                    	        newCompositeNode(grammarAccess.getGradientAccess().getLabelAlignmentLabelAlignmentEnumRuleCall_9_1_0()); 
                    	    
                    pushFollow(FOLLOW_32);
                    lv_labelAlignment_10_0=ruleLabelAlignment();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getGradientRule());
                    	        }
                           		set(
                           			current, 
                           			"labelAlignment",
                            		lv_labelAlignment_10_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.LabelAlignment");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalSiriusTextDsl.g:1773:2: ( (lv_labelExpression_11_0= RULE_EXPRESSION ) )
                    // InternalSiriusTextDsl.g:1774:1: (lv_labelExpression_11_0= RULE_EXPRESSION )
                    {
                    // InternalSiriusTextDsl.g:1774:1: (lv_labelExpression_11_0= RULE_EXPRESSION )
                    // InternalSiriusTextDsl.g:1775:3: lv_labelExpression_11_0= RULE_EXPRESSION
                    {
                    lv_labelExpression_11_0=(Token)match(input,RULE_EXPRESSION,FOLLOW_55); 

                    			newLeafNode(lv_labelExpression_11_0, grammarAccess.getGradientAccess().getLabelExpressionEXPRESSIONTerminalRuleCall_9_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGradientRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"labelExpression",
                            		lv_labelExpression_11_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.EXPRESSION");
                    	    

                    }


                    }

                    otherlv_12=(Token)match(input,52,FOLLOW_4); 

                        	newLeafNode(otherlv_12, grammarAccess.getGradientAccess().getInKeyword_9_3());
                        
                    // InternalSiriusTextDsl.g:1795:1: ( ( ruleQualifiedName ) )
                    // InternalSiriusTextDsl.g:1796:1: ( ruleQualifiedName )
                    {
                    // InternalSiriusTextDsl.g:1796:1: ( ruleQualifiedName )
                    // InternalSiriusTextDsl.g:1797:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getGradientRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getGradientAccess().getLabelColorColorCrossReference_9_4_0()); 
                    	    
                    pushFollow(FOLLOW_56);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:1810:4: (otherlv_14= 'border' otherlv_15= 'size' otherlv_16= '=' ( (lv_borderSize_17_0= RULE_INT ) ) otherlv_18= 'in' ( ( ruleQualifiedName ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==53) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalSiriusTextDsl.g:1810:6: otherlv_14= 'border' otherlv_15= 'size' otherlv_16= '=' ( (lv_borderSize_17_0= RULE_INT ) ) otherlv_18= 'in' ( ( ruleQualifiedName ) )
                    {
                    otherlv_14=(Token)match(input,53,FOLLOW_57); 

                        	newLeafNode(otherlv_14, grammarAccess.getGradientAccess().getBorderKeyword_10_0());
                        
                    otherlv_15=(Token)match(input,54,FOLLOW_15); 

                        	newLeafNode(otherlv_15, grammarAccess.getGradientAccess().getSizeKeyword_10_1());
                        
                    otherlv_16=(Token)match(input,20,FOLLOW_58); 

                        	newLeafNode(otherlv_16, grammarAccess.getGradientAccess().getEqualsSignKeyword_10_2());
                        
                    // InternalSiriusTextDsl.g:1822:1: ( (lv_borderSize_17_0= RULE_INT ) )
                    // InternalSiriusTextDsl.g:1823:1: (lv_borderSize_17_0= RULE_INT )
                    {
                    // InternalSiriusTextDsl.g:1823:1: (lv_borderSize_17_0= RULE_INT )
                    // InternalSiriusTextDsl.g:1824:3: lv_borderSize_17_0= RULE_INT
                    {
                    lv_borderSize_17_0=(Token)match(input,RULE_INT,FOLLOW_55); 

                    			newLeafNode(lv_borderSize_17_0, grammarAccess.getGradientAccess().getBorderSizeINTTerminalRuleCall_10_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGradientRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"borderSize",
                            		lv_borderSize_17_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.INT");
                    	    

                    }


                    }

                    otherlv_18=(Token)match(input,52,FOLLOW_4); 

                        	newLeafNode(otherlv_18, grammarAccess.getGradientAccess().getInKeyword_10_4());
                        
                    // InternalSiriusTextDsl.g:1844:1: ( ( ruleQualifiedName ) )
                    // InternalSiriusTextDsl.g:1845:1: ( ruleQualifiedName )
                    {
                    // InternalSiriusTextDsl.g:1845:1: ( ruleQualifiedName )
                    // InternalSiriusTextDsl.g:1846:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getGradientRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getGradientAccess().getBorderColorColorCrossReference_10_5_0()); 
                    	    
                    pushFollow(FOLLOW_59);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:1859:4: (otherlv_20= 'icon' otherlv_21= '=' ( (lv_icon_22_0= RULE_STRING ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==24) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalSiriusTextDsl.g:1859:6: otherlv_20= 'icon' otherlv_21= '=' ( (lv_icon_22_0= RULE_STRING ) )
                    {
                    otherlv_20=(Token)match(input,24,FOLLOW_15); 

                        	newLeafNode(otherlv_20, grammarAccess.getGradientAccess().getIconKeyword_11_0());
                        
                    otherlv_21=(Token)match(input,20,FOLLOW_10); 

                        	newLeafNode(otherlv_21, grammarAccess.getGradientAccess().getEqualsSignKeyword_11_1());
                        
                    // InternalSiriusTextDsl.g:1867:1: ( (lv_icon_22_0= RULE_STRING ) )
                    // InternalSiriusTextDsl.g:1868:1: (lv_icon_22_0= RULE_STRING )
                    {
                    // InternalSiriusTextDsl.g:1868:1: (lv_icon_22_0= RULE_STRING )
                    // InternalSiriusTextDsl.g:1869:3: lv_icon_22_0= RULE_STRING
                    {
                    lv_icon_22_0=(Token)match(input,RULE_STRING,FOLLOW_60); 

                    			newLeafNode(lv_icon_22_0, grammarAccess.getGradientAccess().getIconSTRINGTerminalRuleCall_11_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGradientRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"icon",
                            		lv_icon_22_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:1885:4: (otherlv_23= 'height' otherlv_24= '=' ( (lv_height_25_0= RULE_INT ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==55) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalSiriusTextDsl.g:1885:6: otherlv_23= 'height' otherlv_24= '=' ( (lv_height_25_0= RULE_INT ) )
                    {
                    otherlv_23=(Token)match(input,55,FOLLOW_15); 

                        	newLeafNode(otherlv_23, grammarAccess.getGradientAccess().getHeightKeyword_12_0());
                        
                    otherlv_24=(Token)match(input,20,FOLLOW_58); 

                        	newLeafNode(otherlv_24, grammarAccess.getGradientAccess().getEqualsSignKeyword_12_1());
                        
                    // InternalSiriusTextDsl.g:1893:1: ( (lv_height_25_0= RULE_INT ) )
                    // InternalSiriusTextDsl.g:1894:1: (lv_height_25_0= RULE_INT )
                    {
                    // InternalSiriusTextDsl.g:1894:1: (lv_height_25_0= RULE_INT )
                    // InternalSiriusTextDsl.g:1895:3: lv_height_25_0= RULE_INT
                    {
                    lv_height_25_0=(Token)match(input,RULE_INT,FOLLOW_61); 

                    			newLeafNode(lv_height_25_0, grammarAccess.getGradientAccess().getHeightINTTerminalRuleCall_12_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGradientRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"height",
                            		lv_height_25_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:1911:4: (otherlv_26= 'width' otherlv_27= '=' ( (lv_width_28_0= RULE_INT ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==56) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalSiriusTextDsl.g:1911:6: otherlv_26= 'width' otherlv_27= '=' ( (lv_width_28_0= RULE_INT ) )
                    {
                    otherlv_26=(Token)match(input,56,FOLLOW_15); 

                        	newLeafNode(otherlv_26, grammarAccess.getGradientAccess().getWidthKeyword_13_0());
                        
                    otherlv_27=(Token)match(input,20,FOLLOW_58); 

                        	newLeafNode(otherlv_27, grammarAccess.getGradientAccess().getEqualsSignKeyword_13_1());
                        
                    // InternalSiriusTextDsl.g:1919:1: ( (lv_width_28_0= RULE_INT ) )
                    // InternalSiriusTextDsl.g:1920:1: (lv_width_28_0= RULE_INT )
                    {
                    // InternalSiriusTextDsl.g:1920:1: (lv_width_28_0= RULE_INT )
                    // InternalSiriusTextDsl.g:1921:3: lv_width_28_0= RULE_INT
                    {
                    lv_width_28_0=(Token)match(input,RULE_INT,FOLLOW_21); 

                    			newLeafNode(lv_width_28_0, grammarAccess.getGradientAccess().getWidthINTTerminalRuleCall_13_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGradientRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"width",
                            		lv_width_28_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_29=(Token)match(input,17,FOLLOW_2); 

                	newLeafNode(otherlv_29, grammarAccess.getGradientAccess().getRightCurlyBracketKeyword_14());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGradient"


    // $ANTLR start "entryRulePalette"
    // InternalSiriusTextDsl.g:1949:1: entryRulePalette returns [EObject current=null] : iv_rulePalette= rulePalette EOF ;
    public final EObject entryRulePalette() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePalette = null;


        try {
            // InternalSiriusTextDsl.g:1950:2: (iv_rulePalette= rulePalette EOF )
            // InternalSiriusTextDsl.g:1951:2: iv_rulePalette= rulePalette EOF
            {
             newCompositeNode(grammarAccess.getPaletteRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePalette=rulePalette();

            state._fsp--;

             current =iv_rulePalette; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePalette"


    // $ANTLR start "rulePalette"
    // InternalSiriusTextDsl.g:1958:1: rulePalette returns [EObject current=null] : ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'palette' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_colors_4_0= ruleColor ) )* otherlv_5= '}' ) ;
    public final EObject rulePalette() throws RecognitionException {
        EObject current = null;

        Token lv_documentation_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_colors_4_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:1961:28: ( ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'palette' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_colors_4_0= ruleColor ) )* otherlv_5= '}' ) )
            // InternalSiriusTextDsl.g:1962:1: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'palette' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_colors_4_0= ruleColor ) )* otherlv_5= '}' )
            {
            // InternalSiriusTextDsl.g:1962:1: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'palette' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_colors_4_0= ruleColor ) )* otherlv_5= '}' )
            // InternalSiriusTextDsl.g:1962:2: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'palette' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_colors_4_0= ruleColor ) )* otherlv_5= '}'
            {
            // InternalSiriusTextDsl.g:1962:2: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_DOCUMENTATION) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalSiriusTextDsl.g:1963:1: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    {
                    // InternalSiriusTextDsl.g:1963:1: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    // InternalSiriusTextDsl.g:1964:3: lv_documentation_0_0= RULE_DOCUMENTATION
                    {
                    lv_documentation_0_0=(Token)match(input,RULE_DOCUMENTATION,FOLLOW_62); 

                    			newLeafNode(lv_documentation_0_0, grammarAccess.getPaletteAccess().getDocumentationDOCUMENTATIONTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPaletteRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"documentation",
                            		lv_documentation_0_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.DOCUMENTATION");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,57,FOLLOW_4); 

                	newLeafNode(otherlv_1, grammarAccess.getPaletteAccess().getPaletteKeyword_1());
                
            // InternalSiriusTextDsl.g:1984:1: ( (lv_name_2_0= RULE_ID ) )
            // InternalSiriusTextDsl.g:1985:1: (lv_name_2_0= RULE_ID )
            {
            // InternalSiriusTextDsl.g:1985:1: (lv_name_2_0= RULE_ID )
            // InternalSiriusTextDsl.g:1986:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            			newLeafNode(lv_name_2_0, grammarAccess.getPaletteAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPaletteRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_63); 

                	newLeafNode(otherlv_3, grammarAccess.getPaletteAccess().getLeftCurlyBracketKeyword_3());
                
            // InternalSiriusTextDsl.g:2006:1: ( (lv_colors_4_0= ruleColor ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==58) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalSiriusTextDsl.g:2007:1: (lv_colors_4_0= ruleColor )
            	    {
            	    // InternalSiriusTextDsl.g:2007:1: (lv_colors_4_0= ruleColor )
            	    // InternalSiriusTextDsl.g:2008:3: lv_colors_4_0= ruleColor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPaletteAccess().getColorsColorParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_63);
            	    lv_colors_4_0=ruleColor();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPaletteRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"colors",
            	            		lv_colors_4_0, 
            	            		"org.obeonetwork.sirius.text.SiriusTextDsl.Color");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

                	newLeafNode(otherlv_5, grammarAccess.getPaletteAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePalette"


    // $ANTLR start "entryRuleColor"
    // InternalSiriusTextDsl.g:2036:1: entryRuleColor returns [EObject current=null] : iv_ruleColor= ruleColor EOF ;
    public final EObject entryRuleColor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColor = null;


        try {
            // InternalSiriusTextDsl.g:2037:2: (iv_ruleColor= ruleColor EOF )
            // InternalSiriusTextDsl.g:2038:2: iv_ruleColor= ruleColor EOF
            {
             newCompositeNode(grammarAccess.getColorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColor=ruleColor();

            state._fsp--;

             current =iv_ruleColor; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleColor"


    // $ANTLR start "ruleColor"
    // InternalSiriusTextDsl.g:2045:1: ruleColor returns [EObject current=null] : (otherlv_0= 'color' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleColorValue ) ) ) ;
    public final EObject ruleColor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:2048:28: ( (otherlv_0= 'color' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleColorValue ) ) ) )
            // InternalSiriusTextDsl.g:2049:1: (otherlv_0= 'color' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleColorValue ) ) )
            {
            // InternalSiriusTextDsl.g:2049:1: (otherlv_0= 'color' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleColorValue ) ) )
            // InternalSiriusTextDsl.g:2049:3: otherlv_0= 'color' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleColorValue ) )
            {
            otherlv_0=(Token)match(input,58,FOLLOW_4); 

                	newLeafNode(otherlv_0, grammarAccess.getColorAccess().getColorKeyword_0());
                
            // InternalSiriusTextDsl.g:2053:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalSiriusTextDsl.g:2054:1: (lv_name_1_0= RULE_ID )
            {
            // InternalSiriusTextDsl.g:2054:1: (lv_name_1_0= RULE_ID )
            // InternalSiriusTextDsl.g:2055:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            			newLeafNode(lv_name_1_0, grammarAccess.getColorAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getColorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_64); 

                	newLeafNode(otherlv_2, grammarAccess.getColorAccess().getEqualsSignKeyword_2());
                
            // InternalSiriusTextDsl.g:2075:1: ( (lv_value_3_0= ruleColorValue ) )
            // InternalSiriusTextDsl.g:2076:1: (lv_value_3_0= ruleColorValue )
            {
            // InternalSiriusTextDsl.g:2076:1: (lv_value_3_0= ruleColorValue )
            // InternalSiriusTextDsl.g:2077:3: lv_value_3_0= ruleColorValue
            {
             
            	        newCompositeNode(grammarAccess.getColorAccess().getValueColorValueParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_2);
            lv_value_3_0=ruleColorValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getColorRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_3_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.ColorValue");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleColor"


    // $ANTLR start "entryRuleColorValue"
    // InternalSiriusTextDsl.g:2101:1: entryRuleColorValue returns [EObject current=null] : iv_ruleColorValue= ruleColorValue EOF ;
    public final EObject entryRuleColorValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColorValue = null;


        try {
            // InternalSiriusTextDsl.g:2102:2: (iv_ruleColorValue= ruleColorValue EOF )
            // InternalSiriusTextDsl.g:2103:2: iv_ruleColorValue= ruleColorValue EOF
            {
             newCompositeNode(grammarAccess.getColorValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColorValue=ruleColorValue();

            state._fsp--;

             current =iv_ruleColorValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleColorValue"


    // $ANTLR start "ruleColorValue"
    // InternalSiriusTextDsl.g:2110:1: ruleColorValue returns [EObject current=null] : this_RGB_0= ruleRGB ;
    public final EObject ruleColorValue() throws RecognitionException {
        EObject current = null;

        EObject this_RGB_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:2113:28: (this_RGB_0= ruleRGB )
            // InternalSiriusTextDsl.g:2115:5: this_RGB_0= ruleRGB
            {
             
                    newCompositeNode(grammarAccess.getColorValueAccess().getRGBParserRuleCall()); 
                
            pushFollow(FOLLOW_2);
            this_RGB_0=ruleRGB();

            state._fsp--;

             
                    current = this_RGB_0; 
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleColorValue"


    // $ANTLR start "entryRuleRGB"
    // InternalSiriusTextDsl.g:2131:1: entryRuleRGB returns [EObject current=null] : iv_ruleRGB= ruleRGB EOF ;
    public final EObject entryRuleRGB() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRGB = null;


        try {
            // InternalSiriusTextDsl.g:2132:2: (iv_ruleRGB= ruleRGB EOF )
            // InternalSiriusTextDsl.g:2133:2: iv_ruleRGB= ruleRGB EOF
            {
             newCompositeNode(grammarAccess.getRGBRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRGB=ruleRGB();

            state._fsp--;

             current =iv_ruleRGB; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRGB"


    // $ANTLR start "ruleRGB"
    // InternalSiriusTextDsl.g:2140:1: ruleRGB returns [EObject current=null] : (otherlv_0= 'rgb(' ( (lv_red_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_green_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_blue_5_0= RULE_INT ) ) otherlv_6= ')' ) ;
    public final EObject ruleRGB() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_red_1_0=null;
        Token otherlv_2=null;
        Token lv_green_3_0=null;
        Token otherlv_4=null;
        Token lv_blue_5_0=null;
        Token otherlv_6=null;

         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:2143:28: ( (otherlv_0= 'rgb(' ( (lv_red_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_green_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_blue_5_0= RULE_INT ) ) otherlv_6= ')' ) )
            // InternalSiriusTextDsl.g:2144:1: (otherlv_0= 'rgb(' ( (lv_red_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_green_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_blue_5_0= RULE_INT ) ) otherlv_6= ')' )
            {
            // InternalSiriusTextDsl.g:2144:1: (otherlv_0= 'rgb(' ( (lv_red_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_green_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_blue_5_0= RULE_INT ) ) otherlv_6= ')' )
            // InternalSiriusTextDsl.g:2144:3: otherlv_0= 'rgb(' ( (lv_red_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_green_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_blue_5_0= RULE_INT ) ) otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,59,FOLLOW_58); 

                	newLeafNode(otherlv_0, grammarAccess.getRGBAccess().getRgbKeyword_0());
                
            // InternalSiriusTextDsl.g:2148:1: ( (lv_red_1_0= RULE_INT ) )
            // InternalSiriusTextDsl.g:2149:1: (lv_red_1_0= RULE_INT )
            {
            // InternalSiriusTextDsl.g:2149:1: (lv_red_1_0= RULE_INT )
            // InternalSiriusTextDsl.g:2150:3: lv_red_1_0= RULE_INT
            {
            lv_red_1_0=(Token)match(input,RULE_INT,FOLLOW_65); 

            			newLeafNode(lv_red_1_0, grammarAccess.getRGBAccess().getRedINTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRGBRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"red",
                    		lv_red_1_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.INT");
            	    

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_58); 

                	newLeafNode(otherlv_2, grammarAccess.getRGBAccess().getCommaKeyword_2());
                
            // InternalSiriusTextDsl.g:2170:1: ( (lv_green_3_0= RULE_INT ) )
            // InternalSiriusTextDsl.g:2171:1: (lv_green_3_0= RULE_INT )
            {
            // InternalSiriusTextDsl.g:2171:1: (lv_green_3_0= RULE_INT )
            // InternalSiriusTextDsl.g:2172:3: lv_green_3_0= RULE_INT
            {
            lv_green_3_0=(Token)match(input,RULE_INT,FOLLOW_65); 

            			newLeafNode(lv_green_3_0, grammarAccess.getRGBAccess().getGreenINTTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRGBRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"green",
                    		lv_green_3_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.INT");
            	    

            }


            }

            otherlv_4=(Token)match(input,22,FOLLOW_58); 

                	newLeafNode(otherlv_4, grammarAccess.getRGBAccess().getCommaKeyword_4());
                
            // InternalSiriusTextDsl.g:2192:1: ( (lv_blue_5_0= RULE_INT ) )
            // InternalSiriusTextDsl.g:2193:1: (lv_blue_5_0= RULE_INT )
            {
            // InternalSiriusTextDsl.g:2193:1: (lv_blue_5_0= RULE_INT )
            // InternalSiriusTextDsl.g:2194:3: lv_blue_5_0= RULE_INT
            {
            lv_blue_5_0=(Token)match(input,RULE_INT,FOLLOW_66); 

            			newLeafNode(lv_blue_5_0, grammarAccess.getRGBAccess().getBlueINTTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRGBRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"blue",
                    		lv_blue_5_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.INT");
            	    

            }


            }

            otherlv_6=(Token)match(input,60,FOLLOW_2); 

                	newLeafNode(otherlv_6, grammarAccess.getRGBAccess().getRightParenthesisKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRGB"


    // $ANTLR start "ruleLabelAlignment"
    // InternalSiriusTextDsl.g:2222:1: ruleLabelAlignment returns [Enumerator current=null] : ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'center' ) | (enumLiteral_2= 'right' ) ) ;
    public final Enumerator ruleLabelAlignment() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // InternalSiriusTextDsl.g:2224:28: ( ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'center' ) | (enumLiteral_2= 'right' ) ) )
            // InternalSiriusTextDsl.g:2225:1: ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'center' ) | (enumLiteral_2= 'right' ) )
            {
            // InternalSiriusTextDsl.g:2225:1: ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'center' ) | (enumLiteral_2= 'right' ) )
            int alt50=3;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt50=1;
                }
                break;
            case 62:
                {
                alt50=2;
                }
                break;
            case 63:
                {
                alt50=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // InternalSiriusTextDsl.g:2225:2: (enumLiteral_0= 'left' )
                    {
                    // InternalSiriusTextDsl.g:2225:2: (enumLiteral_0= 'left' )
                    // InternalSiriusTextDsl.g:2225:4: enumLiteral_0= 'left'
                    {
                    enumLiteral_0=(Token)match(input,61,FOLLOW_2); 

                            current = grammarAccess.getLabelAlignmentAccess().getLeftEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getLabelAlignmentAccess().getLeftEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalSiriusTextDsl.g:2231:6: (enumLiteral_1= 'center' )
                    {
                    // InternalSiriusTextDsl.g:2231:6: (enumLiteral_1= 'center' )
                    // InternalSiriusTextDsl.g:2231:8: enumLiteral_1= 'center'
                    {
                    enumLiteral_1=(Token)match(input,62,FOLLOW_2); 

                            current = grammarAccess.getLabelAlignmentAccess().getCenterEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getLabelAlignmentAccess().getCenterEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // InternalSiriusTextDsl.g:2237:6: (enumLiteral_2= 'right' )
                    {
                    // InternalSiriusTextDsl.g:2237:6: (enumLiteral_2= 'right' )
                    // InternalSiriusTextDsl.g:2237:8: enumLiteral_2= 'right'
                    {
                    enumLiteral_2=(Token)match(input,63,FOLLOW_2); 

                            current = grammarAccess.getLabelAlignmentAccess().getRightEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getLabelAlignmentAccess().getRightEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLabelAlignment"


    // $ANTLR start "ruleGradientDirection"
    // InternalSiriusTextDsl.g:2247:1: ruleGradientDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'oblique' ) | (enumLiteral_1= 'lefttoright' ) | (enumLiteral_2= 'toptobottom' ) ) ;
    public final Enumerator ruleGradientDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // InternalSiriusTextDsl.g:2249:28: ( ( (enumLiteral_0= 'oblique' ) | (enumLiteral_1= 'lefttoright' ) | (enumLiteral_2= 'toptobottom' ) ) )
            // InternalSiriusTextDsl.g:2250:1: ( (enumLiteral_0= 'oblique' ) | (enumLiteral_1= 'lefttoright' ) | (enumLiteral_2= 'toptobottom' ) )
            {
            // InternalSiriusTextDsl.g:2250:1: ( (enumLiteral_0= 'oblique' ) | (enumLiteral_1= 'lefttoright' ) | (enumLiteral_2= 'toptobottom' ) )
            int alt51=3;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt51=1;
                }
                break;
            case 65:
                {
                alt51=2;
                }
                break;
            case 66:
                {
                alt51=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }

            switch (alt51) {
                case 1 :
                    // InternalSiriusTextDsl.g:2250:2: (enumLiteral_0= 'oblique' )
                    {
                    // InternalSiriusTextDsl.g:2250:2: (enumLiteral_0= 'oblique' )
                    // InternalSiriusTextDsl.g:2250:4: enumLiteral_0= 'oblique'
                    {
                    enumLiteral_0=(Token)match(input,64,FOLLOW_2); 

                            current = grammarAccess.getGradientDirectionAccess().getObliqueEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getGradientDirectionAccess().getObliqueEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalSiriusTextDsl.g:2256:6: (enumLiteral_1= 'lefttoright' )
                    {
                    // InternalSiriusTextDsl.g:2256:6: (enumLiteral_1= 'lefttoright' )
                    // InternalSiriusTextDsl.g:2256:8: enumLiteral_1= 'lefttoright'
                    {
                    enumLiteral_1=(Token)match(input,65,FOLLOW_2); 

                            current = grammarAccess.getGradientDirectionAccess().getLefttorightEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getGradientDirectionAccess().getLefttorightEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // InternalSiriusTextDsl.g:2262:6: (enumLiteral_2= 'toptobottom' )
                    {
                    // InternalSiriusTextDsl.g:2262:6: (enumLiteral_2= 'toptobottom' )
                    // InternalSiriusTextDsl.g:2262:8: enumLiteral_2= 'toptobottom'
                    {
                    enumLiteral_2=(Token)match(input,66,FOLLOW_2); 

                            current = grammarAccess.getGradientDirectionAccess().getToptobottomEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getGradientDirectionAccess().getToptobottomEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGradientDirection"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x020119003C006010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000060010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000030A0000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000003020000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002020000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000800020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000003C000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000038000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000080400000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000200008000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000400010000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x000000F800020000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x000000F000020000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x000000E000020000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x000000C000020000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000008000020000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000020001000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000600000020000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000200000020000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x01A8000001020000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0xE000000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x01A0000001020000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0180000001020000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0180000000020000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0100000000020000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0400000000020000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x1000000000000000L});

}